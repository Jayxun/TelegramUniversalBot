package org.telegram.buttonBot.bot.controller;

import org.telegram.buttonBot.bot.data.DataBase;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MessageController {
    public static void run(Update update) {

        if (DataBase.userMap.containsKey(DataBase.chatId) &&
                DataBase.userMap.get(DataBase.chatId).isRegistered()){
            MainUI.run(update);
        } else {
            LoginUI.run(update);
            return;
        }




    }
}
