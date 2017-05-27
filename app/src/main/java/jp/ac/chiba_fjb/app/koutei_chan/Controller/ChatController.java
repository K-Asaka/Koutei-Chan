package jp.ac.chiba_fjb.app.koutei_chan.Controller;

import jp.ac.chiba_fjb.app.koutei_chan.Model.Bot.BotModel;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.MessageModel;
import jp.ac.chiba_fjb.app.koutei_chan.Model.ModeModel;
import jp.ac.chiba_fjb.app.koutei_chan.Model.PostModel;

public class ChatController {

    private BotModel botInstance;
    private MessageModel userMessage;

    public ChatController(MessageModel userMessage) {
        this.userMessage = userMessage;
    }

    // DBに投稿するだけ
    public void post() {
        // TODO: 投稿されたデータに対する処理を追加する
        PostModel postModel = new PostModel(userMessage);

        // DBへ正常に追加されたかどうかのチェック
    }

    // 投稿内容からモード (肯定, 質問, 画像) を判断
    // Botのメッセージ取得して、DBに投稿
    // Botのメッセージを返す
    public MessageModel reply() {
        ModeModel mode = new ModeModel();
        BotModel bot = mode.judge(this.userMessage);
        MessageModel botMessage = bot.reply();
        PostModel postModel = new PostModel(botMessage);
        postModel.send();

        return botMessage;
    }

}


