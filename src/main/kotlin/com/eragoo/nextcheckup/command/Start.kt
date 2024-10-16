package com.eragoo.nextcheckup.command

import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.Message
import org.springframework.stereotype.Component

@Component
class Start : CommandHandler {
    override fun command(): String {
        return "/start"
    }

    override fun handle(message: Message, bot: Bot) {
        val chatId = ChatId.fromId(message.chat.id)
        bot.sendMessage(chatId, "Welcome!")
    }
}