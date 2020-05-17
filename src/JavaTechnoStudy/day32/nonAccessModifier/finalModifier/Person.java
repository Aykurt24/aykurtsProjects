package JavaTechnoStudy.day32.nonAccessModifier.finalModifier;

public class Person {
    public final int fingerprintCode;

    public String name;

    public Person(String name, int fingerprint) {
        this.name = name;
        this.fingerprintCode = fingerprint;
    }
}
