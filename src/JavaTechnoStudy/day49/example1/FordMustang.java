package JavaTechnoStudy.day49.example1;

//to inherit from interface use keyword 'implements'
public class FordMustang implements Gas {

    @Override
    public String checkEngine() {
        return "every 6 month";
    }

}
