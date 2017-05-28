package jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel;


import jp.ac.chiba_fjb.app.koutei_chan.R;

// TODO: このクラスはまだ着手していない
public class ImageMessage implements MessageModel {
    private String message; // TODO: ファイルパスになるかも？ (メソッド名はインタフェース関係で変えられない)
    private int userId;
    private int image;
    private int type;


    public ImageMessage(String message, int userId, int image) {
        super();
        this.message = message;
        this.userId  = userId;
        this.image   = image;
        this.type    = MessageType.IMAGE;
    }

    public String getMessage() {
        return this.message;
    }
    public int getUserId() {
        return this.userId;
    }
    public int getImage() { return this.image; }
    public int getType() { return this.type; }
}
