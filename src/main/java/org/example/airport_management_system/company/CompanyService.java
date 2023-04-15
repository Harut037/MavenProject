package org.example.airport_management_system.company;

import org.example.airport_management_system.Connections;
import org.example.airport_management_system.passengers.Passenger;

import java.sql.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompanyService {


    public Company getById(int id){
        Company company = null;
        try {
            Connection connection = Connections.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM company WHERE company_id = " + id;
            ResultSet resultSet = statement.executeQuery(sql);
            company = new Company();
            while(resultSet.next()) {
                company.setCompanyId(resultSet.getInt("company_id"));
                company.setCompanyName(resultSet.getString("company_name"));
                company.setFoundingDate(resultSet.getString("founding_date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return company;
    }


    public Set<Company> getAll() {
        Set<Company> allCompanies = new LinkedHashSet<Company>();

        try {
            Connection connection = Connections.getConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM company";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                Company company = new Company();
                company.setCompanyId(resultSet.getInt("company_id"));
                company.setCompanyName(resultSet.getString("company_name"));
                company.setFoundingDate(resultSet.getString("founding_date"));
                allCompanies.add(company);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return allCompanies;
    }




    public Set<Company> get(int offset, int perPage, String sort) {
        Set<Company> companyList = new LinkedHashSet<Company>();


        try {
            Connection connection = Connections.getConnection();
            String sql = "SELECT * FROM company WHERE company_id >= ? ORDER BY " + sort + " LIMIT ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, offset);
            statement.setInt(2, perPage);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Company company = new Company();
                company.setCompanyId(resultSet.getInt("company_id"));
                company.setCompanyName(resultSet.getString("company_name"));
                company.setFoundingDate(resultSet.getString("founding_date"));
                companyList.add(company);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connections.closeConnection();
        }
        return companyList;
    }
    public Company update(int id,Company company) {
        try {
            Connection connection = Connections.getConnection();
            String sql = "UPDATE company SET company_name = ?,founding_date = ? WHERE company_id = " + id;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, company.getCompanyName());
            statement.setString(2, company.getFoundingDate());
            statement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return company;
    }

    public void delete(int companyId) {
        try {
            Connection connection = Connections.getConnection();
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM company WHERE company_id = " + companyId;
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
