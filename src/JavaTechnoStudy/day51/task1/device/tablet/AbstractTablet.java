package JavaTechnoStudy.day51.task1.device.tablet;


import JavaTechnoStudy.day51.task1.AbstractDevice;
import JavaTechnoStudy.day51.task1.Condition;
import JavaTechnoStudy.day51.task1.Product;

public abstract class AbstractTablet extends AbstractDevice implements Product {
    private boolean pen;

    public AbstractTablet(String name, double price, Condition condition, boolean hasPen) {
        setModel(name);
        setCondition(condition);
        setPrice(price);
        setPen(hasPen);
    }

    public boolean hasPen() {
        return pen;
    }

    public void setPen(boolean pen) {
        this.pen = pen;
    }
}