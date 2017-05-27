package jp.ac.chiba_fjb.app.koutei_chan.Activity;

import android.app.Application;

import io.realm.DynamicRealm;
import io.realm.FieldAttribute;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmMigration;
import io.realm.RealmSchema;

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


    }
}
