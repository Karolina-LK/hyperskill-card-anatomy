package banking;

import java.util.Random;

public class CreatingAccount {
    long cardNo;
    Random random = new Random();

    public void createCardNo(){
        System.out.println("Your card number:" + cardNo);
    }
}
