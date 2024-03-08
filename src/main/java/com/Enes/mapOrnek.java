package com.Enes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class mapOrnek {
    public static void main(String[] args) {

        Map<Integer,String>sehir=new HashMap<>();
        sehir.put(1,"Adana");
        sehir.put(2,"Adiyaman");
        sehir.put(3,"Agri");
        sehir.put(4,"Afyon");
        sehir.put(5,"Amasya");
        sehir.put(6,"Ankara");
        boolean bulunuyorMu;
        sehir.forEach((k,v)-> System.out.println(k+"-"+v));
        System.out.println("--------------------------");
        Set<Integer>keySet=sehir.keySet();
        for (Integer x:keySet){
            System.out.println(x+"-"+sehir.get(x));
        }
       for (int i=0;i<sehir.size();i++)
       {
           System.out.println(sehir.get(6));break;
       }
        if (sehir.keySet().contains(90))
        {
            bulunuyorMu=true;
            System.out.println(bulunuyorMu);
        }
        else
        {
            bulunuyorMu=false;
            System.out.println(bulunuyorMu);
        }
       if (sehir.values().contains("Ankara"))
       {
           bulunuyorMu=true;
           System.out.println(bulunuyorMu);
       }
       else
       {
           bulunuyorMu=false;
           System.out.println(bulunuyorMu);
       }

    }
}
