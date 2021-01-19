package Composition;

public class Motherboard {
    private String model;
    private String manufacture;
    private int ramslot;
    private int cardslot;
    private String bios;

    public Motherboard(String model, String manufacture, int ramslot, int cardslot, String bios) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramslot = ramslot;
        this.cardslot = cardslot;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Programe:"+programName+"loading....");

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getRamslot() {
        return ramslot;
    }

    public void setRamslot(int ramslot) {
        this.ramslot = ramslot;
    }

    public int getCardslot() {
        return cardslot;
    }

    public void setCardslot(int cardslot) {
        this.cardslot = cardslot;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
