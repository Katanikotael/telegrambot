package com.github.katanikotael.jrtb.command;

import com.github.katanikotael.jrtb.services.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 *  Start {@link Command}.
 */

public class StartCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public static String START_MESSAGE = "Привет, это стартовое сообщение.";

    public StartCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }
}
