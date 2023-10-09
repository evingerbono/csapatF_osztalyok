package csapatfeladat;

public class main {

    public static void main(String[] args) {

        Program();

    }

    private static void Program() {

        Negyzet n1 = new Negyzet(5, new Kordinata(1, 3));

        System.out.println(n1.Kiiratas());
    }

}
