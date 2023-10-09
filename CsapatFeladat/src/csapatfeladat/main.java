
package csapatfeladat;


public class main {

   
    public static void main(String[] args) {
        
        Program();
       
    }

    private static void Program() {
        Negyzet n1 = new Negyzet();
        Kordinata k1 = new Kordinata();
        
        n1.setA(5);
        
        k1.setX(1);
        k1.setY(3);
        
        n1.setKor(k1);
        System.out.println(n1.Kiiratas());
    }
    
    
}
