package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(String name, int storageCapacity, String discType) {
        super(name, storageCapacity, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 32k rpm.");
    }

    @Override
    public void readData() {
        System.out.println("I'm sorry, Dave. I'm afraid I can't do that...");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


}
