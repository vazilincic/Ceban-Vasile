package name;

public class F extends E {
    protected String f;

    F(String newF) {
        super("Nikita");
        f = newF;
    }

    @Override
    public String toString() {
        return "F{" +
                "f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                '}';
    }
}