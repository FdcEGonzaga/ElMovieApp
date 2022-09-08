package com.example.movieapp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movieapp.Model.Movie;
import com.example.movieapp.R;

public class MainMovieAdapter extends RecyclerView.Adapter<MainMovieAdapter.MainMovieViewHolder> {
    Movie[] movies;

    public MainMovieAdapter(Movie[] movies) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public MainMovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_movies, parent, false);
        return new MainMovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainMovieViewHolder holder, int position) {
        holder.bindData(movies[position], position);
    }

    @Override
    public int getItemCount() {
        return movies.length;
    }

    public class MainMovieViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        private ImageView vidThumbnail, vidAuthorPic;
        private TextView vidTitle, vidAuthorName, vidViewCount, vidDate;
        
        public MainMovieViewHolder(@NonNull View itemView) {
            super(itemView);
            
            cardView = itemView.findViewById(R.id.vid_cardView);
            vidThumbnail = itemView.findViewById(R.id.vid_thumbnail);
            vidAuthorPic = itemView.findViewById(R.id.vid_authorPic);
            vidTitle = itemView.findViewById(R.id.vid_title);
            vidAuthorName = itemView.findViewById(R.id.vid_authorName);
            vidViewCount = itemView.findViewById(R.id.vid_viewCount);
            vidDate = itemView.findViewById(R.id.vid_date);
        }

        public void bindData(Movie movies, int position) {
            vidThumbnail.setImageResource(movies.getVidThumbnail());
            vidAuthorPic.setImageResource(movies.getVidAuthorPic());
            vidTitle.setText(movies.getVidTitle());
            vidAuthorName.setText(movies.getVidAuthorName() + " -");
            vidViewCount.setText(movies.getVidViewCount() + " views -");
            vidDate.setText(movies.getVidDate());
        }
    }
}
