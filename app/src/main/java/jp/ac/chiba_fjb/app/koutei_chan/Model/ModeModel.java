package jp.ac.chiba_fjb.app.koutei_chan.Model;

import io.realm.Realm;
import jp.ac.chiba_fjb.app.koutei_chan.DB.Mode;
import jp.ac.chiba_fjb.app.koutei_chan.Model.Bot.BotModel;
import jp.ac.chiba_fjb.app.koutei_chan.Model.Bot.GazouChan;
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

        // 肯定ちゃん
        if ( userMessage.getMessage().indexOf("ありがとう") >= 0 ) {
            // モードを肯定ちゃんにする
            realm.beginTransaction();
            mode.setMode(Mode.KOUTEI);
            realm.commitTransaction();
            return new KouteiChan();
        }

        // 質問ちゃん
        if ( mode.getMode() == Mode.SITSUMON ) {
            return new ShitsumonChan();
        }

        // 質問ちゃん
        if ( userMessage.getMessage().indexOf("質問") >= 0 ) {
            // モードを質問ちゃんにする
            realm.beginTransaction();
            mode.setMode(Mode.SITSUMON);
            realm.commitTransaction();
            return new ShitsumonChan();
        }

        // 画像ちゃん
        if ( userMessage.getMessage().indexOf("つらい") >= 0 ) {
            return new GazouChan();
        }

        // 普段は肯定ちゃん
        return new KouteiChan();
    }
}
