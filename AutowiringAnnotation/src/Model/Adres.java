package Model;

/**
 * Created by BeKiR on 05/02/2017.
 */
public class Adres {
    private String mah;
    private String sok;

    public Adres(String mah, String sok) {
        this.mah = mah;
        this.sok = sok;
    }

    public void setMah(String mah) {
        this.mah = mah;
    }

    public void setSok(String sok) {
        this.sok = sok;
    }

    public Adres() {
    }

    @Override
    public String toString() {
        return " Adres:{"+ " Mahallesi : "+ mah +"  Sokak :"+sok +"}";
    }
}
