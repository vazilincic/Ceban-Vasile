package name;

public class C extends B{
    protected String c;

    C(String newC) {
        super("Ion");
        c = newC;
    }

    @Override
    public String toString() {
        return "C{" +
                "c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                '}';
    }
}