package com.gupao.strategy;

public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("EmptyStrategy");
    }
}
