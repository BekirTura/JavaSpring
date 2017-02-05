package model;

/**
 * Created by BeKiR on 05/02/2017.
 */
public class Javaci {
    private  int no;
    private String isim;
    private String soyisim;

    public Javaci(int no, String isim, String surname) {
        this.no = no;
        this.isim = isim;
        this.soyisim = surname;
    }

    @Override
    public String toString() {
        return "Javaci : {" +
                " no : " + no +
                " isim : "+ isim +
                " Soyisim : " + soyisim +
                " }";
    }

    public int getNo() {
        return no;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }
}
