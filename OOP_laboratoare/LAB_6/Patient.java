package company;

import java.util.Date;

public class Patient extends Person {
    String id;
    Integer age;
    Date accepted;
    History sickness;
    String[] prescriptions;
    String[] allergies;
    String[] specialReqs;
    public void works(Patient p, OperationsStaff o){
        System.out.println(p.givenName + "works in" + o.name);
    }
}