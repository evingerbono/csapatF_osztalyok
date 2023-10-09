package csapatfeladat;

public class Negyzet {

    private int a;
    private int x;
    private int y;

    public void setA(int a) {
        if (a <= 0) {
            a = 2;
        }
        this.a = a;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String Kiiratas() {
        return "X kordináta: " + x + "\nY kordináta: " + y + "\n\tA négyzet területe: " + a * a;
    }

}
