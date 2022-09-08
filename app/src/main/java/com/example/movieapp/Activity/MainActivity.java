package com.example.movieapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.movieapp.Adapter.MainMovieAdapter;
import com.example.movieapp.Model.Movie;
import com.example.movieapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mainRv;
    private MainMovieAdapter mainMovieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] usersArrayList = {
                "DeBabby",
                "BabyProBlod",
                "CutieLilBab"
        };

        Movie[] moviesArrayList = {
                new Movie(R.drawable.vid1, "The Joker", R.drawable.auth1, usersArrayList[0], 413, "Aug 26, 2022" ),
                new Movie(R.drawable.vid2, "Lenovo: Recognized as Gartner Power of the Profession Supply Chain Awards", R.drawable.auth3, usersArrayList[2], 413, "Aug 26, 2022" ),
                new Movie(R.drawable.vid3, "The Predator", R.drawable.auth1, usersArrayList[0], 413, "Aug 26, 2022" ),
                new Movie(R.drawable.vid4, "Learn Cyber Security from beginner to pro in just 20 mins.", R.drawable.auth2, usersArrayList[1], 413, "Aug 26, 2022" ),
                new Movie(R.drawable.vid5, "The Hobbit: An Unexpected Journey", R.drawable.auth3, usersArrayList[2], 413, "Aug 26, 2022" ),
                new Movie(R.drawable.vid6, "The Batman", R.drawable.auth1, usersArrayList[0], 413, "Aug 26, 2022" ),
                new Movie(R.drawable.vid7, "The Hunger Games", R.drawable.auth3, usersArrayList[2], 413, "Aug 26, 2022" ),
                new Movie(R.drawable.vid8, "Project Legacy: Things that you should know right now", R.drawable.auth2, usersArrayList[1], 413, "Aug 26, 2022" ),
                new Movie(R.drawable.vid9, "PALLADIO: The most recommended vitamin for adults", R.drawable.auth1, usersArrayList[0], 413, "Aug 26, 2022" )
        };

        mainRv = findViewById(R.id.main_rv);
        mainMovieAdapter = new MainMovieAdapter(moviesArrayList);
        mainRv.setAdapter(mainMovieAdapter);

    }

}