package com.company.SOLID.ISP.Bad;

public class TurnThePhonesOn {

    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        iphone.call();
        iphone.chat();
        iphone.photo();
        Nokia1100 nokia1100 = new Nokia1100();
        nokia1100.call();
        nokia1100.chat();
        nokia1100.photo();
        Nokia3310_3G nokia3310_3G = new Nokia3310_3G();
        nokia3310_3G.call();
        nokia3310_3G.chat();
        nokia3310_3G.photo();
    }
}
