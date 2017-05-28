package jp.ac.chiba_fjb.app.koutei_chan.Activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.github.bassaer.chatmessageview.models.Message;
import com.github.bassaer.chatmessageview.models.User;
import com.github.bassaer.chatmessageview.utils.ChatBot;
import com.github.bassaer.chatmessageview.views.ChatView;

import org.w3c.dom.Text;

import jp.ac.chiba_fjb.app.koutei_chan.Controller.ChatController;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.MessageModel;
import jp.ac.chiba_fjb.app.koutei_chan.Model.MessageModel.TextMessage;
import jp.ac.chiba_fjb.app.koutei_chan.Model.UserId;
import jp.ac.chiba_fjb.app.koutei_chan.R;

public class MainActivity extends AppCompatActivity {
    private ChatView mChatView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int MyId = 0;
        Bitmap Myicon = BitmapFactory.decodeResource(getResources(), R.drawable.akane);
        String Myname = "あなた";

        int YouId =1;
        Bitmap  Youicon = BitmapFactory.decodeResource(getResources(), R.drawable.aoi);
        String Youname = "肯定ちゃん";

        final User me = new User(MyId, Myname,Myicon );
        final User you = new User(YouId, Youname,Youicon);

        mChatView = (ChatView)findViewById(R.id.chat_view);

        mChatView.setOnClickSendButtonListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ユーザの入力をDBに保存, 肯定ちゃんの返信をDBから取得
                TextMessage userMessage = new TextMessage(mChatView.getInputText(), UserId.PLAYER);
                ChatController chatController = new ChatController(userMessage);
                chatController.post();
                MessageModel kouteiChanMessage = chatController.reply();

                // ユーザの発言を表示
                Message message = new Message.Builder()
                        .setUser(me)
                        .setRightMessage(true)
                        .setMessageText(mChatView.getInputText())
                        .hideIcon(true)
                        .build();
                TextView textView = (TextView)findViewById(R.id.textView);
                textView.setText("");
                mChatView.send(message);
                mChatView.setInputText("");

                // 肯定ちゃんの発言を表示
                final Message receivedMessage = new Message.Builder()
                        .setUser(you)
                        .setRightMessage(false)
                        .setMessageText(kouteiChanMessage.getMessage())
                        .build();
                mChatView.send(receivedMessage);

//                Message imgMessage = new Message.Builder()
//                        .setUser(you)
//                        .setRightMessage(false)
//                        .setMessageText("おっぱい")
//                        .setPicture() // Set picture
////                        .setType(Message.Type.PICTURE) //Set Message Type
//                        .build();
//                mChatView.send(imgMessage);
            }
        });
    }
}
