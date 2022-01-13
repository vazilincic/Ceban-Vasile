package name;

public class H extends G {
    protected String h;
    protected X x = new X("X from H class"); // if x is private , classes I and J wont have access

    H(String newH) {
        super("Gherman");
        h = newH;
    }

    @Override
    public String toString() {
        return "H{" +
                "h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x='" + x + '\'' +
                '}';
    }
}