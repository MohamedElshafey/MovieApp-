package com.example.digitalegyptlenovo.movieapp.model;

import java.util.ArrayList;

/**
 * Created by Mohamed Elshafey on 4/11/2018.
 */
public class Movie {

    private int vote_count;
    private int id;
    private boolean video;
    private float vote_average;
    private String title;
    private double popularity;
    private String poster_path;
    private String original_language;
    private String original_title;
    private String[] genre_ids;
    private String backdrop_path;
    private boolean adult;
    private String overview;
    private String release_date;

    public Movie(int vote_count, int id, boolean video, float vote_average, String title, double popularity,
                 String poster_path, String original_language, String original_title, String[] genre_ids,
                 String backdrop_path, boolean adult, String overview, String release_date) {
        this.vote_count = vote_count;
        this.id = id;
        this.video = video;
        this.vote_average = vote_average;

        this.title = title;
        this.popularity = popularity;
        this.poster_path = poster_path;
        this.original_language = original_language;
        this.original_title = original_title;
        this.genre_ids = genre_ids;
        this.backdrop_path = backdrop_path;
        this.adult = adult;
        this.overview = overview;
        this.release_date = release_date;
    }

    public int getVote_count() {
        return vote_count;
    }

    public int getId() {
        return id;
    }

    public boolean isVideo() {
        return video;
    }

    public float getVote_average() {
        return vote_average;
    }

    public String getTitle() {
        return title;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public String[] getGenre_ids() {
        return genre_ids;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public String getRelease_date() {
        return release_date;
    }
}
