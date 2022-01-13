package company;
public class OperationsStaff extends Staff {
    public void works(Patient p, OperationsStaff o){
        System.out.println(p.givenName + "works in" + o.name);
    }

}