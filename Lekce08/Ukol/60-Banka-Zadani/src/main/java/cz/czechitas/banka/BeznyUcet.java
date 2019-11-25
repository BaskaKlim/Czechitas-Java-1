package cz.czechitas.banka;

public class BeznyUcet {

    private double zustatek;
    private double limitPrecerpani;

    //constructors
    public BeznyUcet(double pociatocnaCiastka) {
        this.zustatek = pociatocnaCiastka;
    }

    public BeznyUcet(double pociatocnaCiastka, double pociatocniLimitPrecerpani) {
        this.zustatek = pociatocnaCiastka;
        this.limitPrecerpani = pociatocniLimitPrecerpani;
    }

    // gettrers
    public double getLimitPrecerpani() {
        return limitPrecerpani;
    }

    public double getZustatek() {
        return zustatek;
    }

    public double getPouzitelnyZustatek() {
        return zustatek + limitPrecerpani;
    }

    // methods
    public boolean vyberPenize(double ciastka) {
        if (ciastka > 0 && ciastka < zustatek + limitPrecerpani) {
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
}


