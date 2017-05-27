package jp.ac.chiba_fjb.app.koutei_chan.Model;

import jp.ac.chiba_fjb.app.koutei_chan.Model.Bot.BotModel;
import jp.ac.chiba_fjb.app.koutei_chan.Model.Bot.KouteiChan;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.MessageModel;

public class ModeModel {
    private boolean questionFlag = false;

    public ModeModel() {
        // TODO: DBから質問モードかどうかを取得する
    }

    public BotModel judge(MessageModel userMessage) {
        // TODO: 条件で返すボットを決める

        // TODO: デバッグ用に仮botを返す
        return new KouteiChan();
    }
}
