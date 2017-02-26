package com.shopback.mymovie.mvp.views;

import com.shopback.mymovie.mvp.model.entries.Movie;

import java.util.List;

/**
 * Created by PhearumThann on 2/26/2017.
 * phearumandroid@gmail.com
 */

public interface MovieView extends BaseView {
    void onGetMoviesSuccess(List<Movie> movies, boolean hasMore);

    void onGetMoviesFailure();
}

