package jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel;

public class TextMessage implements MessageModel {
    private String message;
    private int userId;
    private int type;

    public TextMessage(String message, int userId) {
        super();
        this.message = message;
        this.userId  = userId;
        this.type    = MessageType.TEXT;
    }

    public String getMessage(){
        return this.message;
    }
    public int getUserId() { return this.userId; }
    public int getImage() { return 0; }
    public int getType() { return this.type; }
}
