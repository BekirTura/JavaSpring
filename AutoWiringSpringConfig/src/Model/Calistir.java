package Model;

/**
 * Created by BeKiR on 05/02/2017.
 */
public class Calistir {
    private EletrikliMotor em;
    private IctenYanmaliMotor ic;



    public void setEm(EletrikliMotor em) {
        this.em = em;
    }


    public void setIc(IctenYanmaliMotor ic) {
        this.ic = ic;
    }
    public void EmCalistir(){
        em.calistir();
    }
    public void ImCalistir(){
        ic.calistir();
    }
}
