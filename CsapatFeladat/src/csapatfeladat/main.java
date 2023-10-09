
package csapatfeladat;


public class main {

   
    public static void main(String[] args) {

        
        Program();
       
    }

    private static void Program() {
        
        Kordinata k1 = new Kordinata(1,3);
        Negyzet n1 = new Negyzet(5, k1);

      
        System.out.println(n1.Kiiratas());
    }
    
    
}
