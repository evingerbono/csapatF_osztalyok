package csapatfeladat;

public class main {

    public static void main(String[] args) {

        Program();
    }

    private static void Program() {

        Negyzet n1 = new Negyzet(5, new Kordinata());
        System.out.println(n1.Kiiratas());

    }

}
