package com.gupao.strategy;

public class PromotionActive {

    PromotionStrategy promotionStrategy;
    public PromotionActive(PromotionStrategy promotionStrategy){
        this.promotionStrategy= promotionStrategy;
    }
    public void execute(){
        this.promotionStrategy.doPromotion();
    }
}
