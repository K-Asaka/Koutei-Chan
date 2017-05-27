package jp.ac.chiba_fjb.app.koutei_chan.Activity;

import android.app.Application;

import java.util.Arrays;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import jp.ac.chiba_fjb.app.koutei_chan.DB.Bot;
import jp.ac.chiba_fjb.app.koutei_chan.DB.Mode;

// アプリ起動時に呼ばれる, Realmの初期化
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);

        RealmConfiguration config = new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .build();

        // DB初期化して再登録
        // TODO: 投稿履歴とユーザのモードは削除したくない
        Realm.deleteRealm(config);
        config = new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(config);

        // 初期データ投入
        Realm realm = Realm.getDefaultInstance();
        String[] phrases = {"初期データ１だよ！", "初期データ２だよ！", "初期データ３だよ！"};
        for ( String phrase : phrases ) {
            realm.beginTransaction();
            Bot bot = realm.createObject(Bot.class);
            bot.setPhrase(phrase);
            bot.setMode(Mode.KOUTEI);
            realm.commitTransaction();
        }
    }
}
