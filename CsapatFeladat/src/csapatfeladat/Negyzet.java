package csapatfeladat;

public class Negyzet {

    private int a;
    private Kordinata k1;

    public Negyzet(int a, Kordinata k1) {
        if (a <= 1) {
            a = 2;
        }
        this.a = a;
        this.k1 = k1;
    }
    
    public boolean Osszehasonlit(Negyzet masik){
        return a==masik.a;
    }

    @Override
    public String toString() {
        return "Negyzet{" + "Területe=" + a*a + ", X=" + k1.getX() +", Y=" + k1.getY() + '}';
    }
}
