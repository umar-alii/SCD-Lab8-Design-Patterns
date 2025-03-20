package com.Design_Pattern.Lab8.Singleton;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
@Getter
public class GameSettings {

    private static volatile GameSettings instance;
    private int volume;
    private String resolution;

    private GameSettings(){
        volume=25;
        resolution="16x16";
    }

    public static GameSettings getInstance(){
        if(instance == null){
            synchronized(GameSettings.class){
                if(instance == null){
                    return new GameSettings();
                }
            }
        }
        return instance;
    }

    public void getinformation(){
        log.info("Object Information");
        log.info("Volume {}", volume);
        log.info("Resolution {}", resolution);
    }


}
