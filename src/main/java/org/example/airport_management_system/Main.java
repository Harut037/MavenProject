package org.example.airport_management_system;

import org.example.airport_management_system.company.Company;
import org.example.airport_management_system.company.CompanyService;
import org.example.airport_management_system.passengers.Passenger;
import org.example.airport_management_system.passengers.PassengerService;
import org.example.airport_management_system.trip.TripService;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger();
        Connections connections = new Connections();
        CompanyService cs = new CompanyService();
        PassengerService passengerService = new PassengerService();
        TripService ts = new TripService();
        System.out.println(ts.getTripsFrom("'Paris'"));




    }

}
