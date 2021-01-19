package Composition;

import java.util.SplittableRandom;

public class Case {
    private String model;
    private String Manufacture;
    private String powersupply;
    private Dimensions dimensions;

    public Case(String model, String manufacture, String powersupply, Dimensions dimensions) {
        this.model = model;
        Manufacture = manufacture;
        this.powersupply = powersupply;
        this.dimensions = dimensions;
    }
    public void powerPressButton(){
        System.out.println("Power Button Pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public Dimensions getDimension() {
        return dimensions;
    }
}
