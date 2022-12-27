package git3.quizuygulaması;

public class Sorular {
    private String soru;
    private String cevap1;
    private String cevap2;
    private String cevap3;
    private String cevap4;

    public Sorular(String sorumetni, String cevapMetni1, String cevapMetni2, String cevapMetni3, String cevapMetni4){
        this.soru = sorumetni;
        this.cevap1 = cevapMetni1;
        this.cevap2 = cevapMetni2;
        this.cevap3 = cevapMetni3;
        this.cevap4 = cevapMetni4;
    }

    public String getSoru() {
        return soru;
    }

    public String getCevap1() {
        return cevap1;
    }

    public String getCevap2() {
        return cevap2;
    }

    public String getCevap3() {
        return cevap3;
    }

    public String getCevap4() {
        return cevap4;
    }
}

