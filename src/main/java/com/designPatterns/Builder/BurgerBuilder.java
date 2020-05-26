package com.designPatterns.Builder;

public class BurgerBuilder {
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

    public boolean isPepperoni() {
        return pepperoni;
    }

    private String size;
    private String crust;
    private boolean lettice;
    private boolean tomato;
    private boolean pepperoni;

    public BurgerBuilder(String size, String crust) {
        this.size = size;
        this.crust = crust;
    }

    public BurgerBuilder lettice(boolean lettice) {
        this.lettice = lettice;
        return this;
    }

    public BurgerBuilder tomato(boolean tomato) {
        this.tomato = tomato;
        return this;
    }

    public BurgerBuilder pepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public Burger build() {
        Burger burger = new Burger(this);
        return burger;
    }

}
