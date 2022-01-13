package name;

public class E extends D {
    protected String e;

    E(String newE) {
        super("Iurie");
        e = newE;
    }

    @Override
    public String toString() {
        return "E{" +
                "e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                '}';
    }
}