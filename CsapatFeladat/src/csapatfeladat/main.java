
package csapatfeladat;


public class main {

   
    public static void main(String[] args) {
        Program();
    }
    private static void Program() {
        Negyzet n1 = new Negyzet(5, new Kordinata());
        Negyzet n2 = new Negyzet(2, new Kordinata(1,10));
        System.out.println(n1.Osszehasonlit(n2));
    }
    
    
}
