package cz.czechitas.objekty;

public class SpousteciTrida {

    public static void main(String[] args) {
        // vytvorila a inicializovala som si objekty na moj pocitac disk, pamat a processor
        Computer myNotebook = new Computer();

        Disc myDisc = new Disc();
        Disc myExternalDisc = new Disc();
        Memory myMemory = new Memory();
        Processor myProcessor = new Processor();

        // definujem parametre pre objekty aby som mohla zapnut pocitac

        myProcessor.speed = 3600L * 1000L * 1000L;
        myProcessor.manufacturer = "Intel";

        myMemory.capacity = 8L * 1024L * 1024L * 1024L;

        myDisc.capacity = 238L * 1024L * 1024L * 1024L;
        myDisc.usedSpace = 17L * 1024L * 1024L * 1024L;

        myExternalDisc.capacity = 150L * 1024L * 1024L * 1024L;
        myExternalDisc.usedSpace =  43L * 1024L * 1024L * 1024L;

        myNotebook.cpu = myProcessor;
        myNotebook.ram = myMemory;
        myNotebook.hardDisc = myDisc;
        myNotebook.externalDisc = myExternalDisc;

        // prevedenie funkcii a ich check
        System.out.println(myNotebook.toString());
        myNotebook.turnOn();

        System.out.println(myNotebook.toString());
        myNotebook.turnOff();

        myNotebook.turnOff();
        myNotebook.turnOn();

        System.out.println(myDisc.usedSpace);
        myNotebook.createFile(113780L);
        System.out.println(myDisc.usedSpace);
        myNotebook.createFile(80L);
        System.out.println(myDisc.usedSpace);
        myNotebook.deleteFile(11111111111L);
        System.out.println("Space on HardDisc: " + (myDisc.capacity -  myDisc.usedSpace) + "\n"
                + "Space on ExternalDisc: " + (myExternalDisc.capacity - myExternalDisc.usedSpace));
        myNotebook.deleteFile(33333333333L);
        System.out.println("Space on HardDisc: " + (myDisc.capacity -  myDisc.usedSpace) + "\n"
                + "Space on ExternalDisc: " + (myExternalDisc.capacity - myExternalDisc.usedSpace));
        myNotebook.deleteFile(33333333333L);
        System.out.println("Space on HardDisc: " + (myDisc.capacity -  myDisc.usedSpace) + "\n"
                + "Space on ExternalDisc: " + (myExternalDisc.capacity - myExternalDisc.usedSpace));
    }
}
    
