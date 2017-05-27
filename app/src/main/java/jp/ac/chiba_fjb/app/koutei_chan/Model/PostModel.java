package jp.ac.chiba_fjb.app.koutei_chan.Model;

import android.util.Log;

import io.realm.Realm;
import io.realm.RealmResults;
import jp.ac.chiba_fjb.app.koutei_chan.DB.Post;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.MessageModel;

public class PostModel {
    private MessageModel message;

    public PostModel(MessageModel message) {
        this.message = message;
    }

    public void save() {
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        Post post = realm.createObject(Post.class);

        post.setUserId(message.getUserId());
        post.setMessage(message.getMessage());

        realm.commitTransaction();

        // TODO: デバッグ用
        RealmResults<Post> results = realm.where(Post.class).findAll();
        for ( int i=0 ; i < results.size() ; i++ ) {
            Post test = results.get(i);
            Log.d(i + "番目のユーザ", "##############");
            Log.d("userId", String.valueOf(test.getUserId()));
            Log.d("message", test.getMessage());
        }
    }

}
