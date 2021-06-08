package com.company.SOLID.ISP.Good;

public class TurnThePhonesOn {

    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        iphone.call();
        iphone.chat();
        iphone.photo();
        Nokia1100 nokia1100 = new Nokia1100();
        nokia1100.call();
        Nokia3310_3G nokia3310_3G = new Nokia3310_3G();
        nokia3310_3G.call();
        nokia3310_3G.photo();
    }
}
