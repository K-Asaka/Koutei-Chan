package jp.ac.chiba_fjb.app.koutei_chan.Model.Bot;

import java.util.Random;

import io.realm.Realm;
import io.realm.RealmResults;
import jp.ac.chiba_fjb.app.koutei_chan.DB.Bot;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.MessageModel;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.TextMessage;
import jp.ac.chiba_fjb.app.koutei_chan.Model.UserId;

public class KouteiChan implements BotModel {

    @Override
    public MessageModel reply() {
        Realm realm = Realm.getDefaultInstance();
        RealmResults<Bot> results = realm.where(Bot.class).findAll(); // 全ての要素

        Random rmd = new Random();
        Bot bot = results.get(rmd.nextInt(results.size()));

        MessageModel botMessage = new TextMessage(bot.getPhrase(), UserId.KOUTEI);
        return botMessage;
    }
}