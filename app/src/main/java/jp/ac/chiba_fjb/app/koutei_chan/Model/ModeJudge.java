package jp.ac.chiba_fjb.app.koutei_chan.Model;

import jp.ac.chiba_fjb.app.koutei_chan.Model.Bot;
import jp.ac.chiba_fjb.app.koutei_chan.Model.KouteiChan;
import jp.ac.chiba_fjb.app.koutei_chan.Model.Message;

public class ModeJudge {
    private boolean questionFlag = false;

    public ModeJudge() {
        // TODO: DBから質問モードかどうかを取得する
    }

    public Bot judge(Message userMessage) {
        // TODO: 条件で返すボットを決める

        // 仮botを返す
        return new KouteiChan();
    }
}
