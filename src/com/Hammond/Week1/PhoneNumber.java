package com.Hammond.Week1;

/**
 * Created by 016041 on 3/13/2019.
 */
public class PhoneNumber extends Contacts {
    public String phoneNumber;
//override method
    @Override
    public void contacts() {
        System.out.println("Calling: 614-935-0300");
    }
}
