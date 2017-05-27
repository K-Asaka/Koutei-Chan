package jp.ac.chiba_fjb.app.koutei_chan;

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
