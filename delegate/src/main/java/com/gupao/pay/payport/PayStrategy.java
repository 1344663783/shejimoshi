package com.gupao.pay.payport;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {
    public static final String ALI_PAY="Alipay";
    public static final String JD_PAY="jdpay";
    public static final String WECHAT_PAY="wECHATpay";
    public static final String UNION_PAY="Unionpay";
    public static final String DEFAULT_PAY= ALI_PAY;

    private static Map<String,Payment> paymentMap = new HashMap<>();

    static {
        paymentMap.put(ALI_PAY,new AliPay());
        paymentMap.put(JD_PAY,new JdPay());
        paymentMap.put(WECHAT_PAY,new WechatPay());
        paymentMap.put(UNION_PAY,new UnionPay());
        paymentMap.put(DEFAULT_PAY,new AliPay());

    }

    public static Payment get(String payKey){
        if (!paymentMap.containsKey(payKey)){
            return paymentMap.get(DEFAULT_PAY);
        }
        return paymentMap.get(payKey);
    }
}
