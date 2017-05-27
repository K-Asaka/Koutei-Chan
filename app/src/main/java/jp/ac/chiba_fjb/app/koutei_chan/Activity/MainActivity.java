package jp.ac.chiba_fjb.app.koutei_chan.Activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.bassaer.chatmessageview.models.Message;
import com.github.bassaer.chatmessageview.models.User;
import com.github.bassaer.chatmessageview.utils.ChatBot;
import com.github.bassaer.chatmessageview.views.ChatView;
import com.github.bassaer.chatmessageview.views.MessageView;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Handler;
import jp.ac.chiba_fjb.app.koutei_chan.R;

public class MainActivity extends AppCompatActivity {
    private ChatView mChatView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int MyId = 0;
        Bitmap Myicon = BitmapFactory.decodeResource(getResources(), R.drawable.akane);
        String Myname = "kawasi";

        int YouId =1;
        Bitmap  Youicon = BitmapFactory.decodeResource(getResources(), R.drawable.aoi);
        String Youname = "javasone";

        final User me = new User(MyId, Myname,Myicon );
        final User you = new User(YouId, Youname,Youicon);

        mChatView = (ChatView)findViewById(R.id.chat_view);

        mChatView.setOnClickSendButtonListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //new message
                Message message = new Message.Builder()
                        .setUser(me)
                        .setRightMessage(true)
                        .setMessageText(mChatView.getInputText())
                        .hideIcon(true)
                        .build();
                //Set to chat view
                mChatView.send(message);
                //Reset edit text
                mChatView.setInputText("");

                //Receive message
                final Message receivedMessage = new Message.Builder()
                        .setUser(you)
                        .setRightMessage(false)
                        .setMessageText(ChatBot.talk(me.getName(), message.getMessageText()))
                        .build();

            }

        });
    }
}
