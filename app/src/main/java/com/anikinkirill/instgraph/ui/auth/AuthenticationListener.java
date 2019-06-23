package com.anikinkirill.instgraph.ui.auth;

public interface AuthenticationListener {
    void onTokenReceived(String auth_token);
}