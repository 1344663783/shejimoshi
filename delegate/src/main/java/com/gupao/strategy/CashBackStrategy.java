package com.gupao.strategy;

public class CashBackStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现");
    }
}
