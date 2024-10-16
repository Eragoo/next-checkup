package com.eragoo.nextcheckup.command

import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.Message

interface CommandHandler {
    fun command(): String
    fun handle(message: Message, bot: Bot)
}