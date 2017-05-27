package jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel;

public class TextMessage implements MessageModel {
    private String message;
    private int userId;

    public TextMessage(String message, int userId) {
        super();
        this.message = message;
        this.userId  = userId;
    }

    public String getMessage(){
        return this.message;
    }
    public int getUserId() { return this.userId; }
}
