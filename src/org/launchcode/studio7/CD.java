package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String name, int storageCapacity, String discType) {
        super(name, storageCapacity, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 23k rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Would you like to play a game?");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
