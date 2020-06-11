package JavaTechnoStudy.day51.task1.device.phone;


import JavaTechnoStudy.day51.task1.AbstractDevice;
import JavaTechnoStudy.day51.task1.Carrier;

public abstract class AbstractPhone extends AbstractDevice {
    private Carrier carrier;

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncarrier: " + carrier;
    }
}