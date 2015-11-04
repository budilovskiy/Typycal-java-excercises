package com.felixfeatures.ex034;

public class Snail {

    private int sunnyDaySpeed = 0;
    private int cloudyDaySpeed = 0;

    public Snail(int sunnyDaySpeed, int cloudyDaySpeed) {
        this.sunnyDaySpeed = sunnyDaySpeed;
        this.cloudyDaySpeed = cloudyDaySpeed;
    }

    public int getSunnyDaySpeed() {
        return sunnyDaySpeed;
    }

    public void setSunnyDaySpeed(int sunnyDaySpeed) {
        this.sunnyDaySpeed = sunnyDaySpeed;
    }

    public int getCloudyDaySpeed() {
        return cloudyDaySpeed;
    }

    public void setCloudyDaySpeed(int cloudyDaySpeed) {
        this.cloudyDaySpeed = cloudyDaySpeed;
    }
}
