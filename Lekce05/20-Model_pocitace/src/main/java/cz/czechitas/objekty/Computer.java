package cz.czechitas.objekty;

public class Computer {

    Boolean isTurnOn;
    Processor cpu;
    Memory ram;
    Disc hardDisc;
    Disc externalDisc;

    public String toString() {

        return "Computer on/off: " + isTurnOn + "\n" + "Processor CPU: " + cpu + "\n" + "Memory Capacity is: "
                + ram + "\n" + "Disc: " + hardDisc + "\n" + "External Disc: " + externalDisc;
    }

    public void turnOn() {
        // PODMIENKY PRE TO ABY SME MOHOLI ZAPNUT POCITAC
        if (cpu != null && ram != null && hardDisc != null && externalDisc != null) {
            isTurnOn = true;
        } else {
            System.out.println("You need to check out your computer. It cant be turn on! Something is missing!");
        }

        if (isTurnOn == true) {
            System.out.println("The computer is turn on. Move to another action please");
        }
    }

    public void turnOff() {
        if (isTurnOn == true) {
            // prirad novu hodnotu , preto nie == ale len =     (poznamka pre mna nech nezabudnem)
            isTurnOn = false;
        }

    }

    public void createFile(Long fileSize) {
        Long newUsedSpace = hardDisc.usedSpace + fileSize;

        if (isTurnOn == true) {

            if (newUsedSpace <= hardDisc.capacity) {
                hardDisc.usedSpace = hardDisc.usedSpace + fileSize;
            } else if (newUsedSpace <= externalDisc.capacity) {
                externalDisc.usedSpace = externalDisc.usedSpace + fileSize;
            } else {
                System.out.println("\n" + " There is no enough space in your computer, please delete some needless files." + "\n");
            }
        } else {
            System.out.println("\n" + "You need to check out your computer. It is turn out");
        }
    }

    public void deleteFile(Long fileSize) {
        if (isTurnOn == true) {
            if (hardDisc.usedSpace - fileSize > 0) {
                hardDisc.usedSpace = hardDisc.usedSpace - fileSize;
            } else if (hardDisc.usedSpace - fileSize < 0) {
                if (externalDisc.usedSpace - fileSize > 0) {
                    externalDisc.usedSpace = externalDisc.usedSpace - fileSize;
                } else {
                    System.out.println("\n" + "There is no more such big files to delete, try to delete some smaller." + "\n");
                }
            } else {
                System.out.println("\n" + "You need to check out your computer. It is turn out");
            }
        }
    }
}


