//import io.realm.DynamicRealm;
//import io.realm.Realm;
//import io.realm.RealmMigration;
//
//public class Migration implements RealmMigration {
//    @Override
//    public void migrate(DynamicRealm realm, long oldVersion, long newVersion) {
//
//        // Migrate from version 0 to version 1
//        if (oldVersion == 0) {
//            // マイグレーション処理
//            version++;
//        }
//
//        return version;
//    }
//}