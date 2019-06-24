package com.anikinkirill.instgraph.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("data")
    @Expose
    private UserData data;

    @SerializedName("meta")
    @Expose
    private Meta meta;

    public User(){}

    public User(UserData data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    public UserData getData() {
        return data;
    }

    public void setData(UserData data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
