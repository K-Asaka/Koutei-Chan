package jp.ac.chiba_fjb.app.koutei_chan.Activity;

import android.app.Application;

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
        // TODO: フレーズを配列に入れてeachする
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        Bot bot = realm.createObject(Bot.class);
        bot.setPhrase("初期データです。");
        bot.setMode(Mode.KOUTEI);
        realm.commitTransaction();
    }
}
