package com.gupao.strategy;

public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("CouponStrategy");
    }
}
