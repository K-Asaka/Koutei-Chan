package jp.ac.chiba_fjb.app.koutei_chan.Model;

import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel;

public class PostModel {

    private MessageModel message;

    public PostModel(MessageModel message) {
        this.message = message;
    }

    public void send() {
        // TODO: DBに保存する

    }

}
