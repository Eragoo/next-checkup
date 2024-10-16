package com.eragoo.nextcheckup

import com.github.kotlintelegrambot.Bot
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service

@Service
class BotService(
    private val bot: Bot,
) {
    @PostConstruct
    fun startBot() {
        bot.startPolling()
    }
}