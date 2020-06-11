package JavaTechnoStudy.day51.task1.device.laptop;


import JavaTechnoStudy.day51.task1.AbstractDevice;
import JavaTechnoStudy.day51.task1.DisplayType;

public abstract class AbstractLaptop extends AbstractDevice {

    private int RAM;
    private String CPU;
    private DisplayType displayType;


    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public void setDisplayType(DisplayType displayType) {
        this.displayType = displayType;
    }


}