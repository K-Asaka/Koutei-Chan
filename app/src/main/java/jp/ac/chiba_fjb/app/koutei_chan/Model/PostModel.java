package jp.ac.chiba_fjb.app.koutei_chan.Model;

import jp.ac.chiba_fjb.app.koutei_chan.Model.Message;

public class PostModel {

    private Message message;

    public PostModel(Message message) {
        this.message = message;
    }

    public void send() {
        // TODO: DBに保存する

    }

}
