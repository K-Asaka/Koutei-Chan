package jp.ac.chiba_fjb.app.koutei_chan.DB;

import io.realm.RealmObject;

public class Mode extends RealmObject {
    private int mode;

    public int  getMode() { return this.mode; }
    public void setMode(int mode) { this.mode = mode; }
}
