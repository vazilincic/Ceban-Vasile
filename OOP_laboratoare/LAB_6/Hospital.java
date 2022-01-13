import company.Address;
import company.Person;

import java.util.List;

public class Hospital  {
    String name;
    Address address;
    Phone phone;
    private List<Department> departments;
    Hospital (String name, Address address,Phone phone , List<Department> departments){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.departments = departments;

    }

    public void works(Person p, Department d){
        System.out.println(p.givenName + "works in" + d.name);
    }

}