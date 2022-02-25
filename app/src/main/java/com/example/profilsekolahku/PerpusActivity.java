package com.example.profilsekolahku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class PerpusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpus);
    }

    public void Buku7(View view) {
        Intent intent = new Intent(PerpusActivity.this, Buku7Activity.class);
        startActivity(intent);
    }

    public void Buku8(View view) {
        Intent intent = new Intent(PerpusActivity.this, Buku8Activity.class);
        startActivity(intent);
    }

    public void Buku9(View view) {
        Intent intent = new Intent(PerpusActivity.this, Buku9Activity.class);
        startActivity(intent);
    }
}