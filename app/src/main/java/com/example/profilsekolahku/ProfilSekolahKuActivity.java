package com.example.profilsekolahku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ProfilSekolahKuActivity extends AppCompatActivity {
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_sekolah_ku);

        pdfView = (PDFView) findViewById(R.id.pdfView);

        pdfView.fromAsset("profilsekolah.pdf").load();
    }
}