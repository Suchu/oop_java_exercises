package com.techreturners.cats;

public abstract class Attribute implements Cat {

    private Boolean asleep;
    private final String setting;

    public Attribute(Boolean asleep, String setting) {
        this.asleep = asleep;
        this.setting = setting;
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
}
