package com.eragoo.nextcheckup.command

import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.Message
import org.springframework.stereotype.Service

@Service
class CommandDispatcher(
    private val handlers: List<CommandHandler>
) {
    fun dispatch(message: Message, bot: Bot) {
        val command = message.text?.split(" ")?.firstOrNull()
        handlers.forEach { handler ->
            when (command) {
                handler.command() -> handler.handle(message, bot)
            }
        }
    }
}