package com.anikinkirill.instgraph.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("username")
    @Expose
    private String username;

    @SerializedName("profile_picture")
    @Expose
    private String profile_picture;

    @SerializedName("full_name")
    @Expose
    private String full_name;

    @SerializedName("bio")
    @Expose
    private String bio;

    @SerializedName("website")
    @Expose
    private String website;

    @SerializedName("is_business")
    @Expose
    private boolean is_business;

    @SerializedName("media")
    @Expose
    private int media;

    @SerializedName("follows")
    @Expose
    private int follows;

    @SerializedName("followed_by")
    @Expose
    private int followed_by;

    @SerializedName("code")
    @Expose
    private int code;

    public User(){}

    public User(String id, String username, String profile_picture, String full_name, String bio, String website, boolean is_business, int media, int follows, int followed_by, int code) {
        this.id = id;
        this.username = username;
        this.profile_picture = profile_picture;
        this.full_name = full_name;
        this.bio = bio;
        this.website = website;
        this.is_business = is_business;
        this.media = media;
        this.follows = follows;
        this.followed_by = followed_by;
        this.code = code;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isIs_business() {
        return is_business;
    }

    public void setIs_business(boolean is_business) {
        this.is_business = is_business;
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
