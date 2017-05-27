package jp.ac.chiba_fjb.app.koutei_chan.Model;

import jp.ac.chiba_fjb.app.koutei_chan.Model.ImageMessage;
import jp.ac.chiba_fjb.app.koutei_chan.Model.TextMessage;

abstract public class Bot {
    abstract public Message reply();
}

class KouteiChan extends Bot {

    @Override
    public Message reply() {
        Message botMessage = new TextMessage("");

        // TODO: DBからbotのメッセージを取得する

        return botMessage;
    }
}

class GazouChan extends Bot {

    @Override
    public Message reply() {
        return new ImageMessage();
    }
}

class ShitsumonChan extends Bot {

    @Override
    public Message reply() {
        return new TextMessage("");
    }
}