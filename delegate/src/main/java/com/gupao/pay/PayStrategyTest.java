package com.gupao.pay;

import com.gupao.pay.payport.PayStrategy;

public class PayStrategyTest  {

    public static void main(String[] args) {
        Order order = new Order("1","20000000011111110001",324.5);

        MsgResult pay = order.pay(PayStrategy.ALI_PAY);
        System.out.println(pay);
    }
}
