package jp.ac.chiba_fjb.app.koutei_chan;

abstract class Bot {
    abstract public Message reply();
}

class KouteiChan extends Bot {

    @Override
    public Message reply() {
        return null;
    }
}

class GazouChan extends Bot {

    @Override
    public Message reply() {
        return null;
    }
}

class ShitsumonChan extends Bot {

    @Override
    public Message reply() {
        return null;
    }
}