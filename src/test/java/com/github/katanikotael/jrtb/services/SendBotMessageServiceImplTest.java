package com.github.katanikotael.jrtb.services;

import com.github.katanikotael.jrtb.bot.SapTelegramBot;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@DisplayName("Unit-level testing for SendBotMessageServiceImpl")
class SendBotMessageServiceImplTest {

    private SendBotMessageServiceImpl sendBotMessageService;
    private SapTelegramBot sapBot;

    @BeforeEach
    void setUp() {
        sapBot = Mockito.mock(SapTelegramBot.class);
        sendBotMessageService = new SendBotMessageServiceImpl(sapBot);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void shouldProperlySendMessage() throws TelegramApiException {
        //given
        String chatId = "test_chaiId";
        String message = "test_message";

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);
        sendMessage.enableHtml(true);

        //when
        sendBotMessageService.sendMessage(chatId, message);

        //then
        Mockito.verify(sapBot).execute(sendMessage);
    }
}