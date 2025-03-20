package com.Design_Pattern.Lab8.Main;

import com.Design_Pattern.Lab8.Singleton.GameSettings;

public class Main {
    public static void main(String[] args) {
        GameSettings gs = GameSettings.getInstance();

        gs.setVolume(75);
        gs.setResolution("20X20");

        gs.getinformation();

        GameSettings gs2 = GameSettings.getInstance();
        gs2.setVolume(85);
        gs2.setResolution("15X15");

        gs2.getinformation();
    }
}
