package com.Hammond.Week1;

/**
 * Created by 016041 on 3/13/2019.
 */
public class Email extends Contacts{
    public String Email;
//override method
    @Override
    public void contacts() {
        System.out.println("Emailing: ihammond@yahoo.com");
    }
}
