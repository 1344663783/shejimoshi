package com.gupao.strategy;

public class GroupStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("组团");
    }
}
