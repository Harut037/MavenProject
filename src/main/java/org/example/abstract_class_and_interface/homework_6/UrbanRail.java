package org.example.abstract_class_and_interface.homework_6;

public class UrbanRail extends Vehicle {
    private String line;

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public UrbanRail(String number, String type, String line) {
        super(number, type);
        this.line = line;
    }

    @Override
    void operate() {
        System.out.println("Operating the urban rail");
    }
}
