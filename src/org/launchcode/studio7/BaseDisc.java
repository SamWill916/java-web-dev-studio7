package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;
    private int capacityUsed;
    private int capacityRemaining;
    private ArrayList<String> contents = new ArrayList<>();
    private String discType;

    public BaseDisc(String name, int storageCapacity, String discType) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.discType = discType;
    }

public int getCapacityRemaining(){
        return this.storageCapacity - this.capacityUsed;
}
public String getDiscInfo(){
        return "Name: " + this.name + "\nSpace Used: " + this.capacityUsed;
}

}
