package org.example.inheritance.homework_7;

import java.util.List;



//7. Create Address and User  classes using   one-to-many relation.
public class User {
    private String name;
    private List<Address> addresses;

    public User(String name, List<Address> addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void addAddress(Address address) {
//        address.setUser(this);
        this.addresses.add(address);
    }


}
