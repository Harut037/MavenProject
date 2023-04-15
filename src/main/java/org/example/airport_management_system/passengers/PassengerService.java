package org.example.airport_management_system.passengers;

import org.example.airport_management_system.Connections;
import org.example.airport_management_system.passengers.Passenger;

import java.sql.*;
import java.util.*;

public class PassengerService {

public Passenger getById(int id){
    Passenger passenger = null;
    try {
        Connection connection = Connections.getConnection();
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM passengers WHERE passenger_id = " + id;
        ResultSet resultSet = statement.executeQuery(sql);
        passenger = new Passenger();
        while(resultSet.next()) {
            passenger.setId(resultSet.getInt("passenger_id"));
            passenger.setName(resultSet.getString("passenger_name"));
            passenger.setPhone(resultSet.getString("passenger_phone"));
            passenger.setCountry(resultSet.getString("country"));
            passenger.setCity(resultSet.getString("city"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return passenger;
}


    public Set<Passenger> getAll() {
        Set<Passenger> allUsers = new LinkedHashSet<Passenger>();

        try {
            Connection connection = Connections.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM passengers";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                Passenger passenger = new Passenger();
                passenger.setId(resultSet.getInt("passenger_id"));
                passenger.setName(resultSet.getString("passenger_name"));
                passenger.setPhone(resultSet.getString("passenger_phone"));
                passenger.setCountry(resultSet.getString("country"));
                passenger.setCity(resultSet.getString("city"));
                allUsers.add(passenger);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return allUsers;
    }


    /**
     * Method returns a Set starting from a certain id
     * @param offset
     * @param perPage
     * @param sort
     * @return
     */
    public Set<Passenger> get(int offset, int perPage, String sort) {
        Set<Passenger> passengers = new LinkedHashSet<Passenger>();


        try {
            Connection connection = Connections.getConnection();
            String sql = "SELECT * FROM passengers WHERE passenger_id >= ? ORDER BY " + sort + " LIMIT ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, offset);
            statement.setInt(2, perPage);


            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()) {
                Passenger passenger = new Passenger();
                passenger.setId(resultSet.getInt("passenger_id"));
                passenger.setName(resultSet.getString("passenger_name"));
                passenger.setPhone(resultSet.getString("passenger_phone"));
                passenger.setCountry(resultSet.getString("country"));
                passenger.setCity(resultSet.getString("city"));
                passengers.add(passenger);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Connections.closeConnection();

        }

        return passengers;
    }


    public void delete(int passengerId) {
        try {
            Connection connection = Connections.getConnection();
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM passengers WHERE passengers_id = " + passengerId;
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Passenger save(Passenger passenger) {

        try {
            Connection connection = Connections.getConnection();
            String sql = "INSERT INTO passengers(passenger_name,passenger_phone,country,city) VALUES(?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, passenger.getName());
            statement.setString(2, passenger.getPhone());
            statement.setString(3, passenger.getCountry());
            statement.setString(4, passenger.getCity());
            statement.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return passenger;
    }


    public Passenger update(int id,Passenger passenger) {
        try {
            Connection connection = Connections.getConnection();
            String sql = "UPDATE passengers SET passenger_name = ?,passenger_phone = ?, country = ?,city = ? WHERE passenger_id = " + id;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, passenger.getName());
            statement.setString(2, passenger.getPhone());
            statement.setString(3, passenger.getCountry());
            statement.setString(4, passenger.getCity());
            statement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return passenger;
    }




}





