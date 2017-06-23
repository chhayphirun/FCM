package com.kshrd.fcmlesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvDisplay = (TextView) findViewById(R.id.tvDisplay);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            tvDisplay.setText(
                    bundle.getString("name") + "\n" +
                    bundle.getString("wake_up_time")
            );
        }
    }
}
