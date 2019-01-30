package com.day1.wen23;

import com.day1.wen23.util.Marksheet;
public class Program {

    public static void main(String[] args) {
        String[] subjects = { "English", "Nepali", "Math", "Account" };
        Marksheet ms=new Marksheet(subjects);
        ms.entry();
        if(ms.isFail()){
            System.out.println("you have failed");
        }
    }
       

}
