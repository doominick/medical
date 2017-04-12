package com.epam.dominik.medical.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Created by dominik on 4/11/17.
 */
@Entity
public class User {

    private String firstName;

    private String secondName;

    private int age;

    private String addressStreet;

    private String addressBuilding;

    private String addressCity;

    private String addressPostalCode;

    private long pesel;

    private @Id @GeneratedValue UUID uuid;

    private Registry registry;

    private User(){};

    public User(String firstName, String secondName, int age, String addressStreet, String addressBuilding, String addressCity, String addressPostalCode, long pesel, Registry registry) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.addressStreet = addressStreet;
        this.addressBuilding = addressBuilding;
        this.addressCity = addressCity;
        this.addressPostalCode = addressPostalCode;
        this.pesel = pesel;
        this.registry = registry;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressBuilding() {
        return addressBuilding;
    }

    public void setAddressBuilding(String addressBuilding) {
        this.addressBuilding = addressBuilding;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressPostalCode() {
        return addressPostalCode;
    }

    public void setAddressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Registry getRegistry() {
        return registry;
    }

    public void setRegistry(Registry registry) {
        this.registry = registry;
    }
}
