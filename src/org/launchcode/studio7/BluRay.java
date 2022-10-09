package org.launchcode.studio7;

public class BluRay extends DVD{
    public BluRay(String name, int storageCapacity, String discType) {
        super(name, storageCapacity, discType);
    }
    @Override
    public void spinDisc(){
        System.out.println("A blu-ray spins at a rate of 75k rpm");
    }
    @Override
    public void readData(){
        System.out.println("This overrides 'im sorry dave' statement from DVD class. Without this, it would print the data from the DVD class");
    }
}
