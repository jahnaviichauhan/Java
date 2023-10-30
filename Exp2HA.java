/*Program to display deep cloning
 * Name: Jahnavi Singh Chauhan
 * SAP ID: 500102342
 * Roll number: R2142220526
 * Date: 4/10/2023
 */

class Address implements Serializable {
    private String street;

    public Address(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }
}

class Person implements Serializable {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

public class DeepCloneExample {
    public static <T> T deepClone(T object) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(object);
        oos.close();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        T clone = (T) ois.readObject();
        ois.close();

        return clone;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address originalAddress = new Address("123 Main St");
        Person originalPerson = new Person("Alice", originalAddress);

        Person clonedPerson = deepClone(originalPerson);

        // Modify the cloned object
        clonedPerson.getName(); // "Alice"
        clonedPerson.getAddress().getStreet(); // "123 Main St"
        clonedPerson.getAddress().street = "456 Elm St";

        // Changes are NOT reflected in the original object
        originalPerson.getName(); // "Alice"
        originalPerson.getAddress().getStreet(); // "123 Main St" (not "456 Elm St")
    }
}
