package org.example.enums.homework_1;

import java.time.LocalTime;

public abstract class State {


    /**
     * With this method, we know which color is lighting now and how many seconds, we will wait to changing the next color.
     */
    public void changeState() {
        System.out.println();
        if (LocalTime.now().getSecond() <= TrafficLight.RED.getSECONDS()) {
            System.out.print("Traffic light is now " + TrafficLight.RED.getCOLOR() + ".");
            System.out.println(" ( Will change from red to yellow in " + (TrafficLight.RED.getSECONDS() - LocalTime.now().getSecond()) + " seconds )");
            return;
        }
        if (LocalTime.now().getSecond() > TrafficLight.RED.getSECONDS() && LocalTime.now().getSecond() < TrafficLight.GREEN.getSECONDS()) {
            System.out.print("Traffic light is now " + TrafficLight.YELLOW.getCOLOR() + ".");
            System.out.println(" ( Will change from yellow to green in " + (TrafficLight.YELLOW.getSECONDS() + TrafficLight.RED.getSECONDS() - LocalTime.now().getSecond()) + " seconds )");
        } else System.out.print("Traffic light is now " + TrafficLight.GREEN.getCOLOR() + ".");
        System.out.println(" ( Will change from green to red in " + (60 - TrafficLight.RED.getSECONDS() - TrafficLight.YELLOW.getSECONDS() + TrafficLight.GREEN.getSECONDS() - LocalTime.now().getSecond()) + " seconds )");
    }
}
