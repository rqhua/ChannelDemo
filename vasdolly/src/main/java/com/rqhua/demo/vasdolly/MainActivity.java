package com.rqhua.demo.vasdolly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.leon.channel.helper.ChannelReaderUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String channel = ChannelReaderUtil.getChannel(getApplicationContext());
        ((TextView) findViewById(R.id.tv_channel)).setText("渠道：" + channel);
    }
}
