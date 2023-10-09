package csapatfeladat;

public class Negyzet {
    private int a;
    Kordinata k1 = new Kordinata();

    public void setA(int a) {
        if (a <= 1) {
            a = 2;
        }
        this.a = a;
    }

    public String Kiiratas() {
        return "X kordináta: " + k1.getX()+ "\nY kordináta: " + k1.getY()+ "\n\tA négyzet területe: " + a * a;
    }

    public void setK1(Kordinata k1) {
        this.k1 = k1;
    }
}
