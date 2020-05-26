package com.designPatterns.Builder;


public class BurgerBuilderDemo {

    public static void main(String[] args) {
        Burger burger = new BurgerBuilder("10", "thin")
            .lettice(true)
            .pepperoni(true)
            .tomato(false).build();
        System.out.println(burger.isLettice() + "----" + burger.isTomato() + "----" + burger.getSize());
    }
}
