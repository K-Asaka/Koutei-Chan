package jp.ac.chiba_fjb.app.koutei_chan.Model.Bot;

import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.MessageModel;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.TextMessage;

/**
 * Created by allen on 2017/05/28.
 */

public class ShitsumonChan extends BotModel {

    @Override
    public MessageModel reply() {
        return new TextMessage("");
    }
}