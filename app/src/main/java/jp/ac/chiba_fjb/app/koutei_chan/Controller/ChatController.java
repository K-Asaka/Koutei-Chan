package jp.ac.chiba_fjb.app.koutei_chan.Controller;

import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.MessageModel;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.TextMessage;
import jp.ac.chiba_fjb.app.koutei_chan.Model.PostModel;

public class ChatController {
    private MessageModel userMessage;

    public ChatController(MessageModel userMessage) {
        this.userMessage = userMessage;
    }

    // DBに投稿するだけ
    public void post() {
        PostModel postModel = new PostModel(userMessage);
        postModel.save();
    }

    // 投稿内容からモード (肯定, 質問, 画像) を判断
    // Botのメッセージ取得して、DBに投稿
    // Botのメッセージを返す
    public MessageModel reply() {
//        ModeModel mode = new ModeModel();
//        BotModel bot = mode.judge(this.userMessage);
//        MessageModel botMessage = bot.reply();
//        PostModel postModel = new PostModel(botMessage);
//        postModel.save();
//
//        return botMessage;
        // TODO: コンパイル通す用
        return new TextMessage("", 1);
    }

}


