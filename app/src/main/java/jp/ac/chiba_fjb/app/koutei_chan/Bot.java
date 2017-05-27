package jp.ac.chiba_fjb.app.koutei_chan;

abstract class Bot {
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