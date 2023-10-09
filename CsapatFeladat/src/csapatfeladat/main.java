package csapatfeladat;

public class main {

    public static void main(String[] args) {

        Program();
    }

    private static void Program() {

        Negyzet n1 = new Negyzet(5, new Kordinata());
        Negyzet n2 = new Negyzet(5, new Kordinata(1,10));
        
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
        
        System.out.println(n1.Osszehasonlit(n2));
        System.out.println("n1==n2 "+n1.equals(n2));

    }

}
