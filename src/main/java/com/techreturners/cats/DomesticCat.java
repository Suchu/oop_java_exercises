package com.techreturners.cats;

public class DomesticCat extends Attribute {

    public DomesticCat() {
        super(false, "domestic", 23);
    }

    public String eat() {
        double rand = Math.floor(Math.random());
        if (rand < 0.5) {
            return "Purrrrrrr";
        } else {
            return "It will do I suppose";
        }
    }


}
