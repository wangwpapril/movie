package com.example.wwang.movie.model;

public class MovieDetails {

    private String mId;
    private String mTitle;
    private String mYear;
    private String mImdbId;
    private String mType;
    private String mPlot;
    private String mPoster;
    private String mGenre;
    private String mReleased;


    public MovieDetails(){

    }
    public MovieDetails(String id, String title, String year, String imdbId, String type, String plot, String poster){
        this.mId = id;
        this.mTitle = title;
        this.mYear = year;
        this.mImdbId = imdbId;
        this.mType = type;
        this.mPlot = plot;
        this.mPoster = poster;
    }

    public String getmId() { return mId; }

    public String getmTitle() { return mTitle; }

    public String getmYear() { return mYear; }

    public String getmImdbId() { return mImdbId; }

    public String getmType() { return mType; }

    public String getmPlot() { return mPlot; }

    public String getmPoster() { return mPoster; }

    public String getmGenre() { return mGenre; }

    public String getmReleased() { return mReleased; }

    public void setmTitle(String title) {
        this.mTitle = title;
    }

    public void setmPlot(String plot) {
        this.mPlot = plot;
    }

    public void setmPoster(String poster) {
        this.mPoster = poster;
    }

    public void setmYear(String year) { this.mYear = year; }

    public void setmGenre(String genre) { this.mGenre = genre; }

    public void setmReleased(String released) { this.mReleased = released; }
}
