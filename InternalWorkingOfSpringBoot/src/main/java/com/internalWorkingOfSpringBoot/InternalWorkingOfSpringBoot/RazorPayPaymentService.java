package com.internalWorkingOfSpringBoot.InternalWorkingOfSpringBoot;

import org.springframework.stereotype.Component;

@Component // ab ye raxorpaymentservice wala class beans bnn gya hai
public class RazorPayPaymentService {

    public String pay(){
        String payment = "RazorPay Payment";
        System.out.println("payment from: "+payment);
        return payment;
    }
}
