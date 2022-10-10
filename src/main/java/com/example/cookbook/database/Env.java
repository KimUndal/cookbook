package com.example.cookbook.database;

public class Env {
    private final static String USERNAME="postgres";
    private final static String PASSWORD="pourrainet43";

    public static String getUsername(){
        return USERNAME;
    }

    public static String getPassword(){
        return PASSWORD;
    }
}
