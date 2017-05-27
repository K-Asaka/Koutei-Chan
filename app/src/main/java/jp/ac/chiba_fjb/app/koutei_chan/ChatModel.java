package jp.ac.chiba_fjb.app.koutei_chan;

public class ChatModel {

    private Bot botInstance;
    private Message userMessage;

    public ChatModel(Message userMessage) {
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


