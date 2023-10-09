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

    @Override
    public String toString() {
        return "Negyzet{" + "a=" + a + ", k1=" + k1 + '}';
    }

//    public String Kiiratas() {
//        return "X kordináta: " + k1.getX() + "\nY kordináta: " + k1.getY() + "\n\tA négyzet területe: " + a * a;
//    }

}
