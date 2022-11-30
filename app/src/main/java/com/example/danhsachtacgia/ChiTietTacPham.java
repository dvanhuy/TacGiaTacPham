package com.example.danhsachtacgia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class ChiTietTacPham extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_tac_pham);
        Intent intent= getIntent();
        Bundle bundle = intent.getBundleExtra("bundle");
        TacPham tacPham = (TacPham) bundle.getSerializable("data");
        TextView detailname = findViewById(R.id.detailname);
        TextView detaildes = findViewById(R.id.detaildes);
        RatingBar ratingBartg =findViewById(R.id.ratingBartg);
        detailname.setText(tacPham.getTen());
        detaildes.setText(tacPham.getNoidung());
        ratingBartg.setRating(tacPham.getSosao());
    }
}