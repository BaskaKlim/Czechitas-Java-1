package cz.czechitas.banka;

public class BeznyUcet {

    // TODO: Metoda vyberPenize(...) odečte od zůstatku částku, která přijde jako vstupní parametr metody a vrátí true.
    //Pokud by byla metod zavolána se zápornou částkou, vypište chybovou hlášku, neměňte zůstatek a vraťte false.
    //V případě, že jen není dostatek peněz na účtu pro výběr, chybovou hlášku nevypisujte, ale zůstatek také neměňte a vraťte false.
    // TODO: Metoda vlozPenize(...) k zůstatku peníze naopak přičte a vrátí true, což znamená, že se operace povedla.
    //Ani tato metoda neakceptuje zápornou hodnotu částky. V případě záporné částky tedy vypište chybovou hlášku, zůstatek neměňte a vraťte false.

    private double zustatek;

    public BeznyUcet(double pociatocnaCiastka) {
        this.zustatek = pociatocnaCiastka;
    }

    public double getZustatek() {
        return zustatek;
    }

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
}


