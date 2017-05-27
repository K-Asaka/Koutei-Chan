package jp.ac.chiba_fjb.app.koutei_chan.Model.Bot;

import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.ImageMessage;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.MessageModel;

public class GazouChan extends BotModel {

    @Override
    public MessageModel reply() {
        return new ImageMessage();
    }
}