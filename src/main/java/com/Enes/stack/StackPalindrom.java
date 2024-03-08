package com.Enes.stack;

import java.util.Scanner;
import java.util.Stack;

public class StackPalindrom {

    public void kelime()
    {

        Scanner scanner=new Scanner(System.in);
        System.out.println("KELIME GIRINIZ:");
        String sozcuk= scanner.nextLine();
        Stack<String>kelime=new Stack<>();
        kelime.push(sozcuk);
        String yenikelime="";

        for (int i=sozcuk.length()-1;i>=0;i--) {
            yenikelime += sozcuk.charAt(i);
        }
            if (yenikelime.equals(sozcuk))
            {

                System.out.println("Palindrom");
            }
            else
            {
                System.out.println("Palindrom degil");
            }


    }
}
