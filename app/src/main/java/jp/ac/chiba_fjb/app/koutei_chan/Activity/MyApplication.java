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

        // ---------- 初期データ投入
        Realm realm = Realm.getDefaultInstance();

        // ユーザの初期モード (肯定)
        realm.beginTransaction();
        Mode mode = realm.createObject(Mode.class);
        mode.setMode(Mode.KOUTEI);
        realm.commitTransaction();

        // 肯定ちゃんの肯定フレーズ
        String[] kouteiPhrases = {
                "そうだね！",
                "やっぱり格が違うよね！",
                "うんうん",
                "もっと聞かせて！",
                "一緒に頑張ろうね！",
                "すごーい！",
                "さすがです！",
                "私をそう思うよ！",
                "説得力あるな〜",
                "なるほど！",
                "安心だね！",
        };
        for ( String phrase : kouteiPhrases ) {
            realm.beginTransaction();
            Bot bot = realm.createObject(Bot.class);
            bot.setPhrase(phrase);
            bot.setMode(Mode.KOUTEI);
            realm.commitTransaction();
        }

        // 質問ちゃんの肯定フレーズ
        String[] sitsumonPhrases = {
                "ふむふむ",
                "なるほど",
                "そうなんだね"
        };
        for ( String phrase : sitsumonPhrases ) {
            realm.beginTransaction();
            Bot bot = realm.createObject(Bot.class);
            bot.setPhrase(phrase);
            bot.setMode(Mode.SITSUMON);
            realm.commitTransaction();
        }
    }
}
