package git3.quizuygulaması;

import java.awt.font.FontRenderContext;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {

    Scanner input = new Scanner(System.in);
    int dogruCevapSayisi = 0;
    int yanlisCevapSayisi= 0;

    //Soru havuzunu oluşturalım
    Sorular s1 = new Sorular("Which statement is true about Java?",
            "a) Java is a sequence-dependent programming language",
            "b) Java is a code dependent programming language",
            "c) Java is a platform-dependent programming language",
            "d) Java is a platform-independent programming language");

    Sorular s2 = new Sorular("What is the extension of java code files?",
            "a) .js",
            "b) .txt",
            "c) .class",
            "d) .java");

    Sorular s3 = new Sorular("Who invented Java Programming?",
            "a) Guido van Rossum",
            "b) James Gosling",
            "c) Dennis Ritchie",
            "d) Bjarne Stroustrup");

    Sorular s4 = new Sorular("Which one of the following is not a Java feature?",
            "a) Object-oriented",
            "b) Use of pointers",
            "c) Portable",
            "d) Dynamic and Extensible");

    Sorular s5 = new Sorular(" Which of these cannot be used for a variable name in Java?",
            "a) identifier & keyword",
            "b) identifier",
            "c) keyword",
            "d) none of the mentioned");


    public void quizArayuzu(){
        //soruların cevap anahtarını oluşturalım.
        HashMap<Sorular,Character> hMap = new HashMap<>();
        hMap.put(s1,'D');
        hMap.put(s2,'D');
        hMap.put(s3,'B');
        hMap.put(s4,'B');
        hMap.put(s5,'C');

        //Kullanıcıya soruları sor

        for (Map.Entry<Sorular,Character> w : hMap.entrySet()){
            System.out.println(w.getKey().getSoru());
            System.out.println(w.getKey().getCevap1());
            System.out.println(w.getKey().getCevap2());
            System.out.println(w.getKey().getCevap3());
            System.out.println(w.getKey().getCevap4());

            // Kullanıcıdan sorunun cevaplarını al
            System.out.print("Cevabınızı giriniz : ");
            Character secilenCevap = input.next().toUpperCase().charAt(0);

            //Cevabı kontrol et ve dönüt ver
            int esitMi = secilenCevap.compareTo(w.getValue());
            if (esitMi==0){
                System.out.println("----------------------------\nDoğru Cevap :) \n----------------------------");

                dogruCevapSayisi++;
            }else {
                System.out.println("-----------------------------\nYanlış Cevap :( \n-----------------------------");
                yanlisCevapSayisi++;
            }
        }

        //Sonuc Ekranı oluştur
        System.out.println("\n ---------SONUÇ---------");
        System.out.println("Toplam Soru Sayısı  : " + hMap.size());
        System.out.println("Doğru Cevap Sayısı  : " + dogruCevapSayisi);
        System.out.println("Yanlış Cevap Sayısı : " + yanlisCevapSayisi);

        int basariYuzdesi = (100*dogruCevapSayisi)/hMap.size();


        if (basariYuzdesi>79){
            System.out.println("Başarı Yüzdesi : %" + basariYuzdesi + "  " + " ÇOK BAŞARILI :)))) ");
        } else if (basariYuzdesi<41) {
            System.out.println("Başarı Yüzdesi : %" + basariYuzdesi + " " + "BAŞARISIZ :(( ");
        }else {
            System.out.println("Başarı Yüzdesi : %" + basariYuzdesi + " " + "BAŞARILI :) ");
        }


    }
}
