package jp.ac.chiba_fjb.app.koutei_chan.Model.Bot;

import jp.ac.chiba_fjb.app.koutei_chan.Model.Bot.BotModel;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.MessageModel;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.TextMessage;

public class KouteiChan extends BotModel {

    @Override
    public MessageModel reply() {
        MessageModel botMessage = new TextMessage("");
        // TODO: DBからbotのメッセージを取得する
        return botMessage;
    }
}