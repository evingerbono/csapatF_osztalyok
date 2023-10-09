package csapatfeladat;

public class Negyzet {
    private int a;
    private int x,y;
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setA(int a) {
        if (a<1) {
            a=2;
        }
        this.a = a;
    }
    
    public int terulet(int a){
        this.a=a;
        int teruelt=a*a;
        return teruelt;
    }
    
    public void kordinata(int x, int y){
        this.x=x;
        this.y=y;
    }
}
