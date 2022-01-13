package name;

public class A {
    protected String a;
    protected X x;

    A(String z, X newX) {
        a = z;
        x = newX;
    }
    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                "x='" + x + '\'' +
                '}';
    }
}