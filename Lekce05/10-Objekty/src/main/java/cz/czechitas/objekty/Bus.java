package cz.czechitas.objekty;

import java.awt.*;
import java.security.*;

public class Bus {

    int numberOfBus;
    Color color;
    int numberOfpassengers;
    int identificationNumber;

    public String toString() {
        return "Bus " + numberOfBus + " - " + " identificator " + identificationNumber + " - "
                + "mumber of passangers " + numberOfpassengers;
    }

    public void comingPassengers() {
        if (numberOfpassengers < 108) {
            numberOfpassengers++;
        }
    }

    public void leavingOnePassenger() {
        if (numberOfpassengers > 0) {
            numberOfpassengers--;
        }
    }

    public void leavingAllPassengers() {
        while (numberOfpassengers > 0) {
            leavingOnePassenger();
        }
    }

}