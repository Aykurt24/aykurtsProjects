package JavaTechnoStudy.day48.tasks.task3.publicTransport;

public class Train extends AbstractPublicTransport {

    @Override
    public double transportationFee() {
        return 30;
    }

    @Override
    public double speed() {
        return 70;
    }

    @Override
    public int wheelNumber() {
        return 10;
    }
}