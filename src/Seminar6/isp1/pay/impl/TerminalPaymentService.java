package isp1.pay.impl;

import isp1.pay.CreditCardPayer;
import isp1.pay.Payable;
import isp1.pay.WebMoneyPayer;

public class TerminalPaymentService implements Payable, CreditCardPayer, WebMoneyPayer {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Terminal pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }
}

