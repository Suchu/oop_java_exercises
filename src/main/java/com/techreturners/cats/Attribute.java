package com.techreturners.cats;

public abstract class Attribute implements Cat {

    private Boolean asleep;

    public Attribute(Boolean asleep) {
        this.asleep = asleep;
    }

    public Boolean isAsleep() {
        return this.asleep;
    }

    public void goToSleep() {
        this.asleep = true;
    }
}
