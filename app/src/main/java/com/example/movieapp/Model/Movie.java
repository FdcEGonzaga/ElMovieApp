package com.example.movieapp.Model;


import androidx.annotation.DrawableRes;

public class Movie {
    private int vidThumbnail;
    private String vidTitle;
    private int vidAuthorPic;
    private String vidAuthorName;
    private int vidViewCount;
    private String vidDate;

    public Movie(@DrawableRes int vidThumbnail, String vidTitle, @DrawableRes int vidAuthorPic, String vidAuthorName, int vidViewCount, String vidDate) {
        this.vidThumbnail = vidThumbnail;
        this.vidTitle = vidTitle;
        this.vidAuthorPic = vidAuthorPic;
        this.vidAuthorName = vidAuthorName;
        this.vidViewCount = vidViewCount;
        this.vidDate = vidDate;
    }

    public int getVidThumbnail() {
        return vidThumbnail;
    }

    public void setVidThumbnail(int vidThumbnail) {
        this.vidThumbnail = vidThumbnail;
    }

    public String getVidTitle() {
        return vidTitle;
    }

    public void setVidTitle(String vidTitle) {
        this.vidTitle = vidTitle;
    }

    public int getVidAuthorPic() {
        return vidAuthorPic;
    }

    public void setVidAuthorPic(int vidAuthorPic) {
        this.vidAuthorPic = vidAuthorPic;
    }

    public String getVidAuthorName() {
        return vidAuthorName;
    }

    public void setVidAuthorName(String vidAuthorName) {
        this.vidAuthorName = vidAuthorName;
    }

    public int getVidViewCount() {
        return vidViewCount;
    }

    public void setVidViewCount(int vidViewCount) {
        this.vidViewCount = vidViewCount;
    }

    public String getVidDate() {
        return vidDate;
    }

    public void setVidDate(String vidDate) {
        this.vidDate = vidDate;
    }
}
