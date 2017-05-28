package jp.ac.chiba_fjb.app.koutei_chan.Model.Bot;

import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.ImageMessage;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.MessageModel;
import jp.ac.chiba_fjb.app.koutei_chan.Model.UserId;
import jp.ac.chiba_fjb.app.koutei_chan.R;

public class GazouChan implements BotModel {

    @Override
    public MessageModel reply() {
        // TODO: 画像はランダムで選ぶようにする
        return new ImageMessage("1", UserId.KOUTEI, R.drawable.cat1);
    }
}