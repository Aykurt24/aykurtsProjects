package JavaTechnoStudy.day48.tasks.task3.publicTransport;

import JavaTechnoStudy.day48.tasks.task3.AbstractVehicle;

public abstract class AbstractPublicTransport extends AbstractVehicle {

    public abstract double transportationFee();


    @Override
    public String toString() {
        return super.toString() +
                "\ntransportation fee: " + transportationFee()
                ;
    }
}