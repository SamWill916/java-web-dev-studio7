package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        CD cd = new CD("Fiona Apple", 3400, "CD");
        DVD dvd = new DVD("Twister", 9000, "DVD");
        BluRay bluRay = new BluRay("Titanic", 10000, "BluRay");

        cd.spinDisc();
        dvd.spinDisc();
        bluRay.spinDisc();

        cd.readData();
        dvd.readData();
        bluRay.readData();

        System.out.println(cd.getDiscInfo());
        System.out.println(dvd.getDiscInfo());
    }
}
