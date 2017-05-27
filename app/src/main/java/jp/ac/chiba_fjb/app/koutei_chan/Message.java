package jp.ac.chiba_fjb.app.koutei_chan;


public class Message {

}

class TextMessage extends Message {
    private String message;

    public TextMessage(String message) {
        super();
        this.message = message;
    }
}

class ImageMessage extends Message {
    public ImageMessage() {
        super();
    }
}
