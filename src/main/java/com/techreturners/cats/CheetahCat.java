package com.techreturners.cats;

public class CheetahCat extends Attribute {

    public CheetahCat() {
        super(false, "wild", 1100);
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }
}
