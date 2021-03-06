package com.selenium.objects;

public abstract class Config {

    public static final String MAIN_URL = "https://www.n11.com/";
    public static final int WAITTIME_TIMEOUT = 60;
    public static final int WAITTIME_ELEMENTOCCURENCE = 15;
    public static final int WAITTIME_SMALL = 5;
    public static final String DEFAULT_USERNAME = "";
    public static final String DEFAULT_PASSWORD = "";
    public static final String INVALID_PASSWORD = "invalid";

    private Config() {
    }
}
