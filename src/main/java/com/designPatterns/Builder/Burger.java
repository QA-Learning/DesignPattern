package com.designPatterns.Builder;

public class Burger {
    private final String size;
    private final String crust;
    private final boolean lettice;
    private final boolean tomato;
    private final boolean pepperoni;

    public Burger(BurgerBuilder builder) {
        this.size = builder.getSize();
        crust = builder.getCrust();
        lettice = builder.isLettice();
        tomato = builder.isTomato();
        pepperoni = builder.isPepperoni();
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public String getSize() {
        return size;
    }

    public String getCrust() {
        return crust;
    }

    public boolean isLettice() {
        return lettice;
    }

    public boolean isTomato() {
        return tomato;
    }
}
