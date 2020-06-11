package JavaTechnoStudy.day51.task1;

import JavaTechnoStudy.day51.task1.device.laptop.AbstractLaptop;

public class AbstractDevice implements Product {

    private String model;
    private double price;
    private Condition condition;

    @Override
    public double getPrice() {
        return 0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getModel() {
        return null;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        String info = "\n---" + this.getClass().getSimpleName() + "---" +
                "\nmodel: " + this.model +
                "\nprice: " + this.price +
                "\ncondition: " + this.condition;
        if (this instanceof AbstractLaptop) {
            AbstractLaptop laptop = (AbstractLaptop) this;
            info += "\nCPU: " + laptop.getCPU();
            info += "\nRAM: " + laptop.getRAM();
            info += "\nDisplay: " + laptop.getDisplayType();
        }


        return info;
    }
}

