package com.example.recyclerpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvList;
    List<String> titles, descs;
    List<Integer> images;
    AdapterForRVList adapterForRVList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvList = findViewById(R.id.rvList);

        titles = new ArrayList<>();
        descs = new ArrayList<>();
        images = new ArrayList<>();

        for (int i = 0; i < 7; i++){
            titles.add("StuNNer");
            titles.add("Heysay");
            titles.add("Svengali");
            titles.add("Godson");
        }
        for (int i = 0; i < 7; i++){
            descs.add("Description 1: It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lor");
            descs.add("Description 2: It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.");
            descs.add("Description 3: It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.");
            descs.add("Description 4: It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.");
        }
        for (int i = 0; i < 7; i++){
            images.add(R.drawable.ic_android);
            images.add(R.drawable.ic_beach);
            images.add(R.drawable.ic_card);
            images.add(R.drawable.ic_backup);
        }

        GridLayoutManager gridLayoutManager =
                new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false);
        adapterForRVList = new AdapterForRVList(this, titles, descs, images);
        rvList.hasFixedSize();
        rvList.setLayoutManager(gridLayoutManager);
        rvList.setAdapter(adapterForRVList);

    }
}
