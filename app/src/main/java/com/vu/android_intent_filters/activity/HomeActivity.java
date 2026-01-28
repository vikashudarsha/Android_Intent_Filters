package com.vu.android_intent_filters.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.vu.android_intent_filters.R;

public class HomeActivity extends AppCompatActivity {

    private Button profileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.profileBtn = findViewById(R.id.profileButton);
    }

    @Override
    protected void onResume() {
        super.onResume();
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });
    }

    private void openProfile(){
        Intent intent = new Intent();
        intent.setAction("com.vu.android_intent_filters.OPEN_PROFILE");
        startActivity(intent);

    }

}