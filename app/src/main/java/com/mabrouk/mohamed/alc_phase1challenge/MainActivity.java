package com.mabrouk.mohamed.alc_phase1challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button about, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        about = findViewById(R.id.about_alc_btn);
        about.setOnClickListener(this);
        profile = findViewById(R.id.my_profile_btn);
        profile.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.about_alc_btn:
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                break;

            case R.id.my_profile_btn:
                Intent intent2 = new Intent(this, MyProfileActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
