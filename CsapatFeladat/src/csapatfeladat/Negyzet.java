package csapatfeladat;

public class Negyzet {

    private int a;

   
    private Kordinata kor;

    public void setA(int a) {
        if (a <= 1) {
            a = 2;
        }
        this.a = a;
    }
    
     public void setKor(Kordinata kor) {
        this.kor = kor;
    }

    public String Kiiratas() {
        return "X kordináta: " + kor.getX()+ "\nY kordináta: " + kor.getY() + "\n\tA négyzet területe: " + a * a;
    }

}
