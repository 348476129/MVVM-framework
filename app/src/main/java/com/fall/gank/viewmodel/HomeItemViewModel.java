package com.fall.gank.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.fall.gank.BR;

import java.io.Serializable;

/**
 * Created by qqq34 on 2016/11/29.
 */

public class HomeItemViewModel extends BaseObservable implements Serializable{
    private String imageUrl;
    private String name;
    private String subTitle;
    private String videoUrl;

    public HomeItemViewModel(String imageUrl, String subTitle, String name,String videoUrl) {
        this.imageUrl = imageUrl;
        this.subTitle = subTitle;
        this.name = name;
        this.videoUrl=videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
    @Bindable
    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
        notifyPropertyChanged(BR.subTitle);
    }
}
