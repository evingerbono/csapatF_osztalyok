
package csapatfeladat;


public class main {

   
    public static void main(String[] args) {
        Program();
       
    }

    private static void Program() {
        Kordinata k = new Kordinata(3, 8);
        Negyzet n1 = new Negyzet(5, k);
        n1.setK1(k);
        System.out.println(n1.Kiiratas());
    }
    
}
