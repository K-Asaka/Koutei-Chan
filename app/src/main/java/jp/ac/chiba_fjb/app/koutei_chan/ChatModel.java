package jp.ac.chiba_fjb.app.koutei_chan;

import android.media.Image;


/**
 * Created by asaka on 2017/05/27.
 */

public class ChatModel {

    public ChatModel() {

    }

    public void post(PostData postData) {
        // TODO: 投稿されたデータに対する処理を追加する

        // DBへ正常に追加されたかどうかのチェック
    }

    public PostData reply() {

    }

}

class PostData {
}

class PostText extends PostData {
    public PostText(String message) {
        super();
    }
}

class PostImage extends PostData {
}

