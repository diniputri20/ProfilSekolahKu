package com.example.profilsekolahku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class galeryActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    Animation fadein, fadeout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);

        viewFlipper = (ViewFlipper) findViewById(R.id.ViewFlipper);

        fadein = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        fadeout = AnimationUtils.loadAnimation(this,R.anim.fade_out);

        viewFlipper.setInAnimation(fadein);
        viewFlipper.setOutAnimation(fadein);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();

    }

    public void Hutri(View view) {
        Intent intent = new Intent(galeryActivity.this, albumhutriActivity.class);
        startActivity(intent);
    }
    public void pmr(View view) {
        Intent intent = new Intent(galeryActivity.this, albumpmrActivity.class);
        startActivity(intent);
    }

    public void pramuka(View view) {
        Intent intent = new Intent(galeryActivity.this, albumpramukaActivity.class);
        startActivity(intent);
    }
}