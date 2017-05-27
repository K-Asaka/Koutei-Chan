package jp.ac.chiba_fjb.app.koutei_chan;

import android.media.Image;


/**
 * Created by asaka on 2017/05/27.
 */

public class ChatModel {

    public ChatModel() {

    }

    public void post(UserMessage userMessage) {
        // TODO: 投稿されたデータに対する処理を追加する

        // DBへ正常に追加されたかどうかのチェック
    }

    public UserMessage reply() {

    }

}

class UserMessage {
}

class UserText extends UserMessage {
    public UserText(String message) {
        super();
    }
}

class UserImage extends UserMessage {
    public UserImage() {
        super();
    }
}


