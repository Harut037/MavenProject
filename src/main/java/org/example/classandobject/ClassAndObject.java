package org.example.classandobject;

import java.util.Scanner;

public class ClassAndObject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        City city = new City("Yerevan", 10750000);
        City city1 = new City("Moscow", 11980000);
        City city2 = new City("New York", 8468000);
        City city3 = new City("Paris", 2140000);
        city.printInfo();
        city1.printInfo();
        city2.printInfo();
        city3.printInfo();
        System.out.println("------------------------------------");
        // Rectangle rectangle = new Rectangle();
        //rectangle.calculateArea(12,5);
        //System.out.println("Enter please your (  Country, Region, City, Street, House, Bank Name )");
        //Bank bank = new Bank(sc.nextLine(),new Address(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(), sc.nextLine()));
        System.out.println("Id, name, department, gender, age ");
        Employee person = new Employee(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
//        Employee person1 = new Employee(sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt());
//        Employee person2 = new Employee(sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt());
        person.printEmployee();
//        person1.printEmployee();
//        person2.printEmployee();
        Car model1 = new Car("Mercedes C203","Black",37,true);
        Car model2 = new Car("Mercedes S505","White",0,false);
    }
}

class Dog {

}

class Cat {

}

class Horse {

}

class Book {


}

/**
 * Սահմանել City class : fields (name, population )
 * Ստեղծել Yerevan, Moscow, New York , Paris քաղաքները համապատասխան
 * մարդաքանակով
 */
class City {

    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void printInfo() {
        System.out.println(getName() + "  " + getPopulation());

    }
}

/**
 *Սահմանել Rectangle class : fields (length, width ) , methods ( calculateArea() ) .
 * Ստեղծել ուղղանկյուն (բարձրություն 5, լայքն 14) և հաշվել ուղղանկյան
 * մակերեսը ։
 */
class Rectangle {

    public void calculateArea(int length, int width) {
        int area = length * width;
        System.out.println("Area = " + area);
        System.out.println("--------------------------------------");

    }
}

/**
 *Սահմանել Rectangle class : fields (length, width ) , methods ( calculateArea() ) .
 * Ստեղծել ուղղանկյուն (բարձրություն 5, լայքն 14) և հաշվել ուղղանկյան
 * մակերեսը ։
 */
class Address {
    private String country, region, city, street, house;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    /**
     *Սահմանել Address class : fields (country , region, city , street, house ) .
     * Սահմանել Bank class : fields (bankName, address (type Address)) .
     */
    public Address(String country, String region, String city, String street, String house) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;

        System.out.print(getCountry() + "  " + getRegion() + "  " + getCity() + "  " + getStreet() + "  " + getHouse());
    }

}

class Bank {

    private String bankName;
    private Address address;


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Bank(String bankName, Address address) {
        this.bankName = bankName;
        this.address = address;
        System.out.println(getBankName());
    }
}


/**
 * Սահմանել Employee class-ը, որը ունի
 * ● fields (id, name, department, age , gender)
 *
 * ● methods printEmployee() որը տպում է Employee մասին ամբողջական
 * ինֆորմացիա։
 * Ստեղծել 3 աշխատող( 2 տղա և 1 աղջիկ), որոնցից երկուսը աշխատում են
 * նույն դեպարտամենտում և ունեն նույն տարիքը։
 */
class Employee {
    private int age;
    private String id, name, department;


    private String gender;

    public Employee(String id, String name, String department, String gender, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printEmployee() {
        System.out.println("Id    " + getId());
        System.out.println("Name   " + getName());
        System.out.println("Department   " + getDepartment());
        System.out.println("Gender    " + getGender());
        System.out.println("Age    " + getAge());
        System.out.println("-----------------------------------");

    }
}


/**
 * Սահմանել Car class-ը, որը ունի
 * ● fields (model, color, currentSpeed (default արժեքը 0), isEngineStart (true or
 * false))
 * ● methods (stopEngine() անջատում է մատոռը , startEngine() միացնում է մատոռը)
 * Ստեղծել Mercedes C203 սև և S505 սպիտակ մակնիշի մեքենաներ․
 */
class Car {
    private String model, color;
    private double currentSpeed;
    private boolean isEngineStart;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean isEngineStart() {
        return isEngineStart;
    }

    public void setEngineStart(boolean engineStart) {
        isEngineStart = engineStart;
    }

    public Car(String model, String color, double currentSpeed, boolean isEngineStart) {
        this.model = model;
        this.color = color;
        this.currentSpeed = currentSpeed;
        this.isEngineStart = isEngineStart;
    }

    public void stopEngine(){
        isEngineStart = false;
    }

    public void startEngine(){
        isEngineStart = true;
    }
}
