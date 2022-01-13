package name;

public class I extends H {
    protected String i;

    I(String newI) {
        super("Adrian");
        i = newI;
    }

    @Override
    public String toString() {
        return "I{" +
                "g='" + g + '\'' +
                ", h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                '}';
    }
}