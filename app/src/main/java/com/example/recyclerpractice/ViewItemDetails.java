package com.example.recyclerpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewItemDetails extends AppCompatActivity {
    private TextView tvTitle, tvDesc;
    private ImageView ivPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_item_details);

        tvTitle = findViewById(R.id.tvTitle);
        tvDesc = findViewById(R.id.tvDesc);
        ivPhoto = findViewById(R.id.ivPhoto);

        tvTitle.setText(getIntent().getStringExtra("title"));
        tvDesc.setText(getIntent().getStringExtra("desc"));
        ivPhoto.setImageResource(getIntent().getIntExtra("image", 1));
    }
}
