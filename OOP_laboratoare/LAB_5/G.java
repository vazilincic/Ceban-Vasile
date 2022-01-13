package name;

public class G extends F {
    protected String g;

    G(String newG) {
        super("Nicolae");
        g = newG;
    }

    @Override
    public String toString() {
        return "G{" +
                "g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                '}';
    }
}