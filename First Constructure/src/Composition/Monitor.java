package Composition;

public class Monitor {
    private String model;
    private String manufacture;
    private int size;
    private Resolution nativeSolution;

    public Monitor(String model, String manufacture, int size, Resolution nativeSolution) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.nativeSolution = nativeSolution;
    }
    public void drawPixelAt(int x, int y, String color){
        System.out.println("Draw Pixel At x:"+x+"y:"+y+ "in color"+color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeSolution() {
        return nativeSolution;
    }
}
