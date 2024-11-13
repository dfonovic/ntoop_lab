package razlomak;
import util.GCD;

public class Razlomak {
    
    private int brojnik;
    private int nazivnik;

    public Razlomak(int brojnik, int nazivnik) {
        this.brojnik = brojnik;
        this.nazivnik = nazivnik;
        skratiRazlomak();
    }


    public int getBrojnik() {
        return this.brojnik;
    }

    public void setBrojnik(int brojnik) {
        this.brojnik = brojnik;
    }

    public int getNazivnik() {
        return this.nazivnik;
    }

    public void setNazivnik(int nazivnik) {
        this.nazivnik = nazivnik;
    }

    @Override
    public String toString() {
        return "{" + getBrojnik() + "/" + getNazivnik() + "}";
    }

    public void skratiRazlomak() {
        int a = GCD.gcd(this.brojnik, this.nazivnik);
        this.brojnik /= a;
        this.nazivnik /= a;
    }

}
