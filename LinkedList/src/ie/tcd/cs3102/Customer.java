package ie.tcd.cs3102;

/**
 * Created by brian on 31/01/2017.
 */
public class Customer {
    String name;
    String address;
    String ID;

    public Customer(String name, String address, String ID) {
        this.name = name;
        this.address = address;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + address + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return ID != null ? ID.equals(customer.ID) : customer.ID == null;

    }

    @Override
    public int hashCode() {
        return ID != null ? ID.hashCode() : 0;
    }
}
