package com.example.android.sunshine.ui.detail;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.WeatherEntry;

import java.util.Date;

/**
 * {@link ViewModel} for {@link DetailActivity}
 */
class DetailActivityViewModel extends ViewModel {

    // Weather forecast the user is looking at
    private final LiveData<WeatherEntry> mWeather;

    // Date for the weather forecast
    private final Date mDate;
    private final SunshineRepository mRepository;

    public DetailActivityViewModel(SunshineRepository repository, Date date) {
        mRepository = repository;
        mDate = date;
        mWeather = mRepository.getWeatherByDate(mDate);
    }

    public LiveData<WeatherEntry> getWeather() {
        return mWeather;
    }
}