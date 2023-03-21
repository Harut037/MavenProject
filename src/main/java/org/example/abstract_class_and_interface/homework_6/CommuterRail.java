package org.example.abstract_class_and_interface.homework_6;

public class CommuterRail extends Vehicle {
    private String line;

    public CommuterRail(String number, String type, String line) {
        super(number, type);
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }


    @Override
    void operate() {
        System.out.println("Operating the commuter rail");
    }
}
