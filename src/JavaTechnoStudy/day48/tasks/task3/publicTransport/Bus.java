package JavaTechnoStudy.day48.tasks.task3.publicTransport;

public class Bus extends AbstractPublicTransport {

    @Override
    public double speed() {
        return 40;
    }

    @Override
    public int wheelNumber() {
        return 8;
    }

    @Override
    public double transportationFee() {
        return 7;// 7$
    }
}
