
package csapatfeladat;


public class main {

   
    public static void main(String[] args) {
        Negyzet n1 = new Negyzet();
        Kordinata k = new Kordinata();
        n1.setA(0);
        k.setX(1);
        k.setY(3);
        n1.setK1(k);
        System.out.println(n1.Kiiratas());
       
    }
    
}
