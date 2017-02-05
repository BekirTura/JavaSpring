package Deneme;

/**
 * Created by BeKiR on 05/02/2017.
 */
public class Adress {
    private String sokakAdi;
    private String mah;

    public Adress() {
    }

    public Adress(String sokakAdi, String mah) {
        this.sokakAdi = sokakAdi;
        this.mah = mah;
    }

    public String getSokakAdi() {
        return sokakAdi;
    }

    public String getMah() {
        return mah;
    }

    public void setSokakAdi(String sokakAdi) {
        this.sokakAdi = sokakAdi;
    }

    public void setMah(String mah) {
        this.mah = mah;
    }
}
