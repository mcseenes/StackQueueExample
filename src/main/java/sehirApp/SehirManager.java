package sehirApp;

import java.util.*;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;

public class SehirManager {
    public static void main(String[] args) {
        sehirleriOlustur();
    }
    public static List<Sehir> sehirleriOlustur() {
        List<Sehir> sehirler = new ArrayList<>();
        Random random = new Random();
        for (String sehirismi : Arrays.stream(SehirDatabase.iller).toList()) {
            String sehirAd=SehirDatabase.iller[random.nextInt(SehirDatabase.iller.length)];
            int nufus = random.nextInt(4900000) + 100000;
            String plaka = String.format("%02d", sehirler.size() + 1);
            EBolge bolge = EBolge.values()[random.nextInt(4)];
            Sehir sehir = new Sehir(sehirAd, nufus, plaka, bolge);
            sehirler.add(sehir);
        }
        List<Sehir> isim = sehirler.stream().filter(sehir ->
                sehir.getBolge().equals(EBolge.BOLGE_1)).toList();
        isim.stream().forEach(System.out::println);
        System.out.println("///////////////////////");
        isim.forEach(name -> System.out.println(name.getIsim()));
        Set<String> plaka = sehirler.stream().filter(sehir -> sehir.getNufus() > 100000 && sehir.getNufus()
                        < 1000000).map(Sehir::getPlakaNo).collect(Collectors.toSet());
        System.out.println("///////////////////////");
        List<Sehir> basharf = sehirler.stream().filter(sehir -> sehir.getIsim().startsWith("B")).toList();
        basharf.forEach(System.out::println);
        System.out.println("///////////////////////");
        basharf.stream().mapToInt(x-> x.getIsim().length()).sum();
        System.out.println("KARAKTER UZUNLUGU TOPLAMI:"+basharf);
        System.out.println("///////////////////////");
        int uzunluk = sehirler.stream().filter(sehir -> sehir.getIsim().startsWith("B")).mapToInt(x->
                x.getIsim().length()).sum();
        System.out.println("KARAKTER UZUNLUGU TOPLAMI:"+uzunluk);
        System.out.println("///////////////////////");
        long toplamnufus=sehirler.stream().mapToLong(x-> x.getNufus()).sum();
        System.out.println("TURKIYE NIN NUFUSU:"+toplamnufus);
        System.out.println("///////////////////////");
        LongSummaryStatistics statistics=sehirler.stream().filter(x->
                x.getBolge().equals(EBolge.BOLGE_1)).map(y->
                y.getNufus()).collect(Collectors.summarizingLong(z-> z));
        System.out.println("ISTATISTIKLER:"+statistics);
        System.out.println("///////////////////////");
       List<Sehir> birmilyon=sehirler.stream().filter(x-> x.getNufus()>1000000).toList();
       birmilyon.forEach(x-> System.out.println("BIR MILYONDAN FAZLA NUFUSA SAHIP ILLER:"+ x.getIsim()));
        System.out.println("///////////////////////");
     List<Sehir> teksayi=sehirler.stream().filter(x-> x.getBolge().equals(EBolge.BOLGE_3)).toList();
     teksayi.forEach(x-> System.out.println(x.getPlakaNo()));
        System.out.println("///////////////////////");
    sehirler.forEach(x-> System.out.println(x.getPlakaNo()+"-"+ x.getIsim().substring(0,3)));
        return sehirler;
    }
    }



