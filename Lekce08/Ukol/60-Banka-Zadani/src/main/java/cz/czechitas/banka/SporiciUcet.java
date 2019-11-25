package cz.czechitas.banka;

public class SporiciUcet {

    private double zustatek;
    private double urokovaMira;

    //constructors
    public SporiciUcet(double pociatocnaCiastka) {
        this.zustatek = pociatocnaCiastka;
    }

    public SporiciUcet(double pociatocnaCiastka, double pocatocniUrokovaMira) {
        this.zustatek = pociatocnaCiastka;
        this.urokovaMira = pocatocniUrokovaMira;
    }

    // gettrers
    public double getUrokovaMira() {
        return urokovaMira;
    }

    public double getZustatek() {
        return zustatek;
    }
    

    // methods
    public boolean vyberPenize(double ciastka) {
        if (ciastka > 0 && ciastka < zustatek) {
            zustatek = zustatek - ciastka;
            return true ;
        } else if (ciastka < 0) {
            System.out.println("Zadali ste zapornu sumu!");
            return false;
        } else {
            return false;
        }
    }

    public boolean vlozPenize(double ciastka) {
        if (ciastka > 0) {
            zustatek = zustatek + ciastka;
            return true;
        } else {
            return false;

        }
    }

    public void vypocitejRocniUrokAVlozHoNaUcet(){
        vlozPenize(urokovaMira*zustatek);
    }
}
