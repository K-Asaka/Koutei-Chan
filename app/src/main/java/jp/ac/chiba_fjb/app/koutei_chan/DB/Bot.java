package jp.ac.chiba_fjb.app.koutei_chan.DB;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Bot extends RealmObject {
    private int id; // TODO: いらないかも
    private String phrase;
    private int mode;

    public int    getId() { return this.id; }
    public void   setId(int id) { this.id = id; }
    public String getPhrase() { return this.phrase; }
    public void   setPhrase(String phrase) { this.phrase = phrase; }
    public int    getMode() { return this.mode; }
    public void   setMode(int mode) { this.mode = mode; }
}
