/*Program to display shallow cloning
 * Name: Jahnavi Singh Chauhan
 * SAP ID: 500102342
 * Roll number: R2142220526
 * Date: 4/10/2023
 */

class Address {
    private String street;
    public Address(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }
}

class Person implements Cloneable {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

public class ShallowCloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address originalAddress = new Address("123 Main St");
        Person originalPerson = new Person("Alice", originalAddress);

        Person clonedPerson = (Person) originalPerson.clone();

        // Modify the cloned object
        clonedPerson.getName(); // "Alice"
        clonedPerson.getAddress().getStreet(); // "123 Main St"
        clonedPerson.getAddress().street = "456 Elm St";

        // Changes are reflected in the original object
        originalPerson.getName(); // "Alice"
        originalPerson.getAddress().getStreet(); // "456 Elm St" (not "123 Main St")
    }
}

