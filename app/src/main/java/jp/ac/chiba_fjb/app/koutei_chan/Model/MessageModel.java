package jp.ac.chiba_fjb.app.koutei_chan.Model;


public class MessageModel {

}

class TextMessage extends MessageModel {
    private String message;

    public TextMessage(String message) {
        super();
        this.message = message;
    }
}

class ImageMessage extends MessageModel {
    public ImageMessage() {
        super();
    }
}
