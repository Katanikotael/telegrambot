package com.github.katanikotael.jrtb.command;

import com.github.katanikotael.jrtb.services.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Unknown {@link Command}.
 */

public class UnknownCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public static final String UNKNOWN_MESSAGE ="Не понимаю вас, " +
            "напишите /help чтобы узнать что я понимаю.";

    public UnknownCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), UNKNOWN_MESSAGE);
    }

//
//    private String getUnknownMessage(Update update) {
//        return String.format("Не понимаю вас, %s, \uD83D\uDE1F " +
//                "напишите /help чтобы узнать что я понимаю.",
//                update.getMessage().getFrom().getFirstName());
//    }
}
