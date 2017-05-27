package jp.ac.chiba_fjb.app.koutei_chan;

abstract class Bot {
    abstract public UserMessage reply();
}

class KouteiChan extends Bot {

    @Override
    public UserMessage reply() {
        return null;
    }
}

class GazouChan extends Bot {

    @Override
    public UserMessage reply() {
        return null;
    }
}

class ShitsumonChan extends Bot {

    @Override
    public UserMessage reply() {
        return null;
    }
}