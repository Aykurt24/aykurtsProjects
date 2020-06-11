package JavaTechnoStudy.day51.task1.device.tv;

import JavaTechnoStudy.day51.task1.AbstractDevice;
import JavaTechnoStudy.day51.task1.Product;

public abstract class AbstractTV extends AbstractDevice implements Product {

    private double diagonal;
    private String os;
    private boolean smart;

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

}