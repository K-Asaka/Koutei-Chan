package jp.ac.chiba_fjb.app.koutei_chan.Model;

import android.util.Log;

import io.realm.Realm;
import jp.ac.chiba_fjb.app.koutei_chan.DB.Bot;
import jp.ac.chiba_fjb.app.koutei_chan.DB.Mode;
import jp.ac.chiba_fjb.app.koutei_chan.Model.Bot.BotModel;
import jp.ac.chiba_fjb.app.koutei_chan.Model.Bot.KouteiChan;
import jp.ac.chiba_fjb.app.koutei_chan.Model.Bot.ShitsumonChan;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.MessageModel;

public class ModeModel {
    private boolean questionFlag = false;

    public ModeModel() {
    }

    public BotModel judge(MessageModel userMessage) {
        Realm realm = Realm.getDefaultInstance();
        Mode mode = realm.where(Mode.class).findFirst(); // 一つだけ

        Log.d("モード", "入った！");

        if ( userMessage.getMessage().indexOf("ari") >= 0 ) {
            Log.d("モード", "ありがとう");
            // モードを肯定ちゃんにする
            realm.beginTransaction();
            mode.setMode(Mode.KOUTEI);
            realm.commitTransaction();
            return new KouteiChan();
        }

        if ( mode.getMode() == Mode.SITSUMON ) {
            Log.d("モード", "質問継続");
            return new ShitsumonChan();
        }

        if ( userMessage.getMessage().indexOf("situ") >= 0 ) {
            Log.d("モード", "質問モード");
            // モードを質問ちゃんにする
            realm.beginTransaction();
            mode.setMode(Mode.SITSUMON);
            realm.commitTransaction();
            return new ShitsumonChan();
        }

        Log.d("モード", "肯定ちゃん");
        Log.d("文字列一致", String.valueOf(userMessage.getMessage().indexOf("ari")));

        // 普段は肯定ちゃん
        return new KouteiChan();
    }
}
