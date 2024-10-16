package com.eragoo.nextcheckup

import com.eragoo.nextcheckup.command.CommandDispatcher
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.message
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Config {

    @Bean
    fun telegramBot(commandDispatcher: CommandDispatcher): Bot {
        return bot {
            token = System.getenv("TELEGRAM_BOT_TOKEN")
            dispatch { message {  commandDispatcher.dispatch(this.message, this.bot) } }
        }
    }
}