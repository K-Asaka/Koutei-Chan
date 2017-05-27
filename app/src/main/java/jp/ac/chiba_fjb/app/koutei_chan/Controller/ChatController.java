package jp.ac.chiba_fjb.app.koutei_chan.Controller;

import jp.ac.chiba_fjb.app.koutei_chan.Model.Bot;
import jp.ac.chiba_fjb.app.koutei_chan.Model.Message;
import jp.ac.chiba_fjb.app.koutei_chan.Model.ModeJudge;
import jp.ac.chiba_fjb.app.koutei_chan.Model.PostModel;

public class ChatController {

    private Bot botInstance;
    private Message userMessage;

    public ChatController(Message userMessage) {
        this.userMessage = userMessage;
    }

    public void post() {
        // TODO: 投稿されたデータに対する処理を追加する
        PostModel postModel = new PostModel(userMessage);

        // DBへ正常に追加されたかどうかのチェック

    }

    public Message reply() {
        ModeJudge mode = new ModeJudge();
        Bot bot = mode.judge(this.userMessage);
        Message botMessage = bot.reply();
        PostModel postModel = new PostModel(botMessage);
        postModel.send();

        return botMessage;
    }

}


