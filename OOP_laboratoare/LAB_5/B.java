package name;

public class B extends A{
    protected String b;

    B(String newB) {
        super("Vasile", new X("Andrei")); //calling A
        b = newB;
    }

    @Override
    public String toString() {
        return "B{" +
                "a='" + a + '\'' +
                "b='" + b + '\'' +
                "x='" + x + '\'' +
                '}';
    }
}