package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button btnFollow = (Button)this.findViewById(R.id.btnFollow);
    btnFollow.setOnClickListener(new btnFollowHandler());

    class btnFollowHandler implements Button.OnClickListener
    {
        public void onClick(View v)
        {
            if (User.followed) {
                User.followed = false;
                btn.setText("Follow");
            }
            else {
                User.followed = true;
                btn.setText("Unfollow");
            }
        }
    }
}