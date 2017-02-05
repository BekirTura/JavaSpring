package Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by BeKiR on 05/02/2017.
 */
public class Calisan {
    private int no;
    private String name;
    private String surname;
    @Autowired
    @Qualifier("adres2")
    private Adres  adres;

    public Calisan(int no, String name, String surname, Adres adres) {
        this.no = no;
        this.name = name;
        this.surname = surname;
        this.adres = adres;
    }

    public Calisan() {
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Calisan:{"+"no:"+no +" name: "+name+"adres"+adres+"}";
    }
}
