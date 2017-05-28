package jp.ac.chiba_fjb.app.koutei_chan.Model.Bot;

import java.util.Random;

import io.realm.Realm;
import io.realm.RealmResults;
import jp.ac.chiba_fjb.app.koutei_chan.DB.Bot;
import jp.ac.chiba_fjb.app.koutei_chan.DB.Mode;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.MessageModel;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.TextMessage;
import jp.ac.chiba_fjb.app.koutei_chan.Model.UserId;

public class KouteiChan implements BotModel {
    private String defaultMessage = "";

    public KouteiChan(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    public KouteiChan() { }

    @Override
    public MessageModel reply() {
        Realm realm = Realm.getDefaultInstance();
        RealmResults<Bot> results = realm.where(Bot.class)
                .equalTo("mode", Mode.KOUTEI)
                .findAll();

        // デフォルトのメッセージがあればそれを出す
        MessageModel botMessage;
        if (this.defaultMessage == "" ) {
            Random rmd = new Random();
            Bot bot = results.get(rmd.nextInt(results.size()));
            botMessage = new TextMessage(bot.getPhrase(), UserId.KOUTEI);
        } else {
            botMessage = new TextMessage(this.defaultMessage, UserId.KOUTEI);
        }

        return botMessage;
    }
}