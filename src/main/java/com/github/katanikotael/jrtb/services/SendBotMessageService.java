package com.github.katanikotael.jrtb.services;

/**
 *  Service for sending messages via telegram bot.
 */

public interface SendBotMessageService {

    /**
     * Send message via telegram bot.
     *
     * @param chatId provided chatId in which message would be send.
     * @param message provided message to be send.
     */

    void sendMessage(String chatId, String message);
}
