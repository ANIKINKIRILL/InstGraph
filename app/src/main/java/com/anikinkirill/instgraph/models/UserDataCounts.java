package com.anikinkirill.instgraph.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserDataCounts {

    @SerializedName("media")
    @Expose
    private int media;

    @SerializedName("follows")
    @Expose
    private int follows;

    @SerializedName("followed_by")
    @Expose
    private int followed_by;

    public UserDataCounts(){}

    public UserDataCounts(int media, int follows, int followed_by) {
        this.media = media;
        this.follows = follows;
        this.followed_by = followed_by;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public int getFollows() {
        return follows;
    }

    public void setFollows(int follows) {
        this.follows = follows;
    }

    public int getFollowed_by() {
        return followed_by;
    }

    public void setFollowed_by(int followed_by) {
        this.followed_by = followed_by;
    }
}
