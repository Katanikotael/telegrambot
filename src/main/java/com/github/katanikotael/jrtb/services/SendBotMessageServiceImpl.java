package com.github.katanikotael.jrtb.services;

import com.github.katanikotael.jrtb.bot.SapTelegramBot;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 * Implementation of {@link SendBotMessageService} interface.
 */

@Service
public class SendBotMessageServiceImpl implements SendBotMessageService {

    private final SapTelegramBot sapBot;

    public SendBotMessageServiceImpl(SapTelegramBot sapBot) {
        this.sapBot = sapBot;
    }

    @Override
    public void sendMessage(String chatId, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);
        sendMessage.setText(message);

        try {
            sapBot.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
