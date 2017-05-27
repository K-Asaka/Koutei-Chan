package jp.ac.chiba_fjb.app.koutei_chan.Model.Bot;

import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.MessageModel;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.TextMessage;
import jp.ac.chiba_fjb.app.koutei_chan.Model.UserId;

public class ShitsumonChan implements BotModel {

    @Override
    public MessageModel reply() {
        return new TextMessage("", UserId.KOUTEI);
    }
}