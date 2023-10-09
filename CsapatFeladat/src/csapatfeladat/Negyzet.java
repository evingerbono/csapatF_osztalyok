package csapatfeladat;

public class Negyzet {

    private int a;
    private Kordinata k1;

    public Negyzet(int a, Kordinata k1) {
        if (a <= 1) {
            a = 2;
        }
        this.a = a;
        this.k1 = k1;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.a;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Negyzet other = (Negyzet) obj;
        return this.a == other.a;
    }

    public boolean Osszehasonlit(Negyzet masik) {
        return a == masik.a;
    }

    @Override
    public String toString() {
        return "Negyzet{" + "Területe=" + a * a + ", X=" + k1.getX() + ", Y=" + k1.getY() + '}';
    }
}
