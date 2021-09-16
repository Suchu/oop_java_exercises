package com.techreturners.cats;

public abstract class Attribute implements Cat {

    private Boolean asleep;
    private final String setting;
    private int height;

    public Attribute(Boolean asleep, String setting, int height) {
        this.asleep = asleep;
        this.setting = setting;
        this.height = height;
    }

    public Boolean isAsleep() {
        return asleep;
    }

    public void goToSleep() {
        asleep = true;
    }

    public void wakeUp() {
        asleep = false;
    }

    public String getSetting() {
        return setting;
    }

    public int getAverageHeight() {
        return height;
    }

    public abstract String eat();
}
