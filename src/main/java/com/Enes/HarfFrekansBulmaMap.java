package com.Enes;

import java.util.HashMap;
import java.util.Map;

public class HarfFrekansBulmaMap {

    public static void    kelime(String sozcuk)
    {
        HashMap<Object, Object> frekans = new HashMap<Object, Object>();
        for (int i=0;i<sozcuk.length();i++)
        {
            if(!frekans.containsKey(sozcuk.charAt(i)))
            {
                frekans.put(sozcuk.charAt(i),1);
            }
            else
            {
                int count= (int)frekans.get(sozcuk.charAt(i));
                frekans.put(sozcuk.charAt(i),count+1);
            }
        }
        System.out.println(sozcuk);
        System.out.println(frekans);
        }

    public static void main(String[] args) {
        kelime("HAYAT");
    }
    }









