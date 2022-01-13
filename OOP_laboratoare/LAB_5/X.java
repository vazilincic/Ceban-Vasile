package name;

public class X {
    private String name;

    X(String someName) {
        name = someName;
    }

    @Override
    public String toString(){
        return name;
    }
}