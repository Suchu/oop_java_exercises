package com.techreturners.cats;

public abstract class Attribute implements Cat {

    private Boolean asleep;

    public Attribute(Boolean asleep) {
        this.asleep = asleep;
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
}
