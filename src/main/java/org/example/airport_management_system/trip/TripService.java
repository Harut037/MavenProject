package org.example.airport_management_system.trip;

import org.example.airport_management_system.Connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;



public class TripService {

    /**
     * Method gets by id Trip
     * @param id
     * @return
     */
    public Trip getById(int id) {
        Trip trip = null;
        try {
            Connection connection = Connections.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM trip WHERE id = " + id;
            ResultSet resultSet = statement.executeQuery(sql);
            trip = new Trip();
            if(resultSet.next()) {
                trip.setId(resultSet.getInt("id"));
                trip.setCompanyId(resultSet.getInt("company_id"));
                trip.setAircraftModel(resultSet.getString("aircraft_model"));
                trip.setTownFrom(resultSet.getString("town_from"));
                trip.setTownTo(resultSet.getString("town_to"));
                trip.setTimeOut(resultSet.getString("time_out"));
                trip.setTimeIn(resultSet.getString("time_in"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connections.closeConnection();
        }
        return trip;
    }

    /**
     * Method gets all Trips from Table
     * @return
     */
    public Set<Trip> getAll() {
        Set<Trip> allTrips = new LinkedHashSet<Trip>();
        try {
            Connection connection = Connections.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM trip";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                Trip trip = new Trip();
                trip.setId(resultSet.getInt("id"));
                trip.setCompanyId(resultSet.getInt("company_id"));
                trip.setAircraftModel(resultSet.getString("aircraft_model"));
                trip.setTownFrom(resultSet.getString("town_from"));
                trip.setTownTo(resultSet.getString("town_to"));
                trip.setTimeOut(resultSet.getString("time_out"));
                trip.setTimeIn(resultSet.getString("time_in"));
                allTrips.add(trip);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Connections.closeConnection();

        }
        return allTrips;
    }

    /**
     * Method returns a Set starting from a certain id
     * @param offset
     * @param perPage
     * @param sort
     * @return
     */
    public Set<Trip> get(int offset, int perPage, String sort) {
        Set<Trip> allTrips = new LinkedHashSet<Trip>();

        try {
            Connection connection = Connections.getConnection();
            String sql = "SELECT * FROM trip WHERE id >= ? ORDER BY " + sort + " LIMIT ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, offset);
            statement.setInt(2, perPage);

            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()) {
                Trip trip = new Trip();
                trip.setId(resultSet.getInt("id"));
                trip.setCompanyId(resultSet.getInt("company_id"));
                trip.setAircraftModel(resultSet.getString("aircraft_model"));
                trip.setTownFrom(resultSet.getString("town_from"));
                trip.setTownTo(resultSet.getString("town_to"));
                trip.setTimeOut(resultSet.getString("time_out"));
                trip.setTimeIn(resultSet.getString("time_in"));
                allTrips.add(trip);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Connections.closeConnection();

        }

        return allTrips;
    }

    /**
     * Method saves new Trip
     * @return
     */
    public Trip save(Trip trip) {
        try {
            Connection connection = Connections.getConnection();
            String sql = "INSERT INTO trip(company_id,aircraft_model,town_from,town_to,time_out,time_in) VALUES(?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, trip.getCompanyId());
            statement.setString(2, trip.getAircraftModel());
            statement.setString(3, trip.getTownFrom());
            statement.setString(4, trip.getTownTo());
            statement.setString(5, trip.getTimeOut());
            statement.setString(6, trip.getTimeIn());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Connections.closeConnection();

        }
        return trip;
    }

    /**
     * Method updates trip by ID
     * @param id
     * @return
     */
    public Trip update(int id,Trip trip) {
        try {
            Connection connection = Connections.getConnection();
            String sql = "UPDATE trip SET company_id = ?,aircraft_model = ?,town_from = ?,town_to = ?, time_out = ?, time_in = ? WHERE id = " + id;
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, trip.getCompanyId());
            statement.setString(2, trip.getAircraftModel());
            statement.setString(3, trip.getTownFrom());
            statement.setString(4, trip.getTownTo());
            statement.setString(5, trip.getTimeOut());
            statement.setString(6, trip.getTimeIn());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Connections.closeConnection();
        }
        return trip;
    }

    /**
     * Method removes trip by id
     */
    public void delete(int tripId) {
        try {
            Connection connection = Connections.getConnection();
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM trip WHERE id = " + tripId;
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Connections.closeConnection();

        }
    }

    /**
     * Method Gets all Trips from city
     * @param city
     * @return
     */
    public Set<Trip> getTripsFrom(String city) {

        Set<Trip> tripsFromList = new LinkedHashSet<>();

        Trip trip = null;
        try {
            Connection connection = Connections.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM trip WHERE town_from = " + city;
            ResultSet resultSet = statement.executeQuery(sql);
            trip = new Trip();
            while(resultSet.next()) {
                trip.setId(resultSet.getInt("id"));
                trip.setCompanyId(resultSet.getInt("company_id"));
                trip.setAircraftModel(resultSet.getString("aircraft_model"));
                trip.setTownFrom(resultSet.getString("town_from"));
                trip.setTownTo(resultSet.getString("town_to"));
                trip.setTimeOut(resultSet.getString("time_out"));
                trip.setTimeIn(resultSet.getString("time_in"));
                tripsFromList.add(trip);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connections.closeConnection();
        }
        return tripsFromList;
    }

    /**
     *  Method Gets all Trips to city
     * @param city
     * @return
     */
  public Set<Trip> getTripsTo(String city) {
        Set<Trip> tripsToList = new LinkedHashSet<Trip>();
        Trip trip = null;
        try {
            Connection connection = Connections.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM trip WHERE town_to = " + city;
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                trip = new Trip();
                trip.setId(resultSet.getInt("id"));
                trip.setCompanyId(resultSet.getInt("company_id"));
                trip.setAircraftModel(resultSet.getString("aircraft_model"));
                trip.setTownFrom(resultSet.getString("town_from"));
                trip.setTownTo(resultSet.getString("town_to"));
                trip.setTimeOut(resultSet.getString("time_out"));
                trip.setTimeIn(resultSet.getString("time_in"));
                tripsToList.add(trip);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connections.closeConnection();
        }
        return tripsToList;
    }
    }

