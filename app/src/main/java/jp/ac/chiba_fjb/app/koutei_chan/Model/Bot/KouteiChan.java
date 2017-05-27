package jp.ac.chiba_fjb.app.koutei_chan.Model.Bot;

import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.MessageModel;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.TextMessage;
import jp.ac.chiba_fjb.app.koutei_chan.Model.UserId;

public class KouteiChan implements BotModel {

    @Override
    public MessageModel reply() {
        MessageModel botMessage = new TextMessage("", UserId.KOUTEI);
        // TODO: DBからbotのメッセージを取得する
        return botMessage;
    }
}