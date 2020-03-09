package com.gupao.strategy;

public class PromotionActivityTest {
    public static void main(String[] args) {
        //优惠券
        PromotionActive active618 = new PromotionActive(new CouponStrategy());
        //双11
        PromotionActive active1111 = new PromotionActive(new CashBackStrategy());

        active618.execute();
        active1111.execute();
    }
}
