package jp.ac.chiba_fjb.app.koutei_chan.DB;

import io.realm.RealmObject;

public class Mode extends RealmObject {
    public static final int KOUTEI   = 0;
    public static final int SITSUMON = 1;
    public static final int GAZOU    = 2;

    private int mode;

    public int  getMode() { return this.mode; }
    public void setMode(int mode) { this.mode = mode; }
}
