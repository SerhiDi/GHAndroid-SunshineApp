package com.example.android.sunshine.ui.detail;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.database.WeatherEntry;

/**
 * {@link ViewModel} for {@link DetailActivity}
 */
public class DetailActivityViewModel extends ViewModel {

    // Weather forecast the user is looking at
    private MutableLiveData<WeatherEntry> mWeather;

    public DetailActivityViewModel() {
        mWeather = new MutableLiveData<>();
    }

    public MutableLiveData<WeatherEntry> getWeather() {
        return mWeather;
    }

    public void setWeather(WeatherEntry weatherEntry) {
        mWeather.postValue(weatherEntry);
    }
}