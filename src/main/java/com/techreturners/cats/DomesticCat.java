package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends Attribute {

    public DomesticCat() {
        super(false, "domestic", 23);
    }

    public String eat() {
        String[] randomComment = {"Purrrrrrr", "It will do I suppose"};
        Random random = new Random();
        int rand = random.nextInt(randomComment.length);
        return randomComment[rand];
    }
}
