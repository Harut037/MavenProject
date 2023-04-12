package org.example.jdbc_with_postgre_sql;

import java.sql.*;
import java.util.Scanner;


public class Users {


    private static final String DB_USER_NAME = "postgres";
    private static final String DB_PASSWORD = "h01112002";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/ForJava";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER_NAME, DB_PASSWORD);

        while (true) {
            System.out.println("1. Create new user");
            System.out.println("2. Read from database");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");


            int command = scanner.nextInt();


// CRUD
            switch (command) {

                case 1:
                    String sql = "INSERT INTO task (first_name,last_name) " +
                            "VALUES (?, ?)";
                    PreparedStatement pstmt = connection.prepareStatement(sql);
                    pstmt.setString(1, scanner.next());
                    pstmt.setInt(2, scanner.nextInt());
                    pstmt.executeUpdate();
                    break;

                case 2:
                    Statement statement1 = connection.createStatement();
                    String SQL_SELECT_TASKS = "select * from users order by id ASC";
                    ResultSet result = statement1.executeQuery(SQL_SELECT_TASKS);

                    System.out.println("ID|__|Name|___|Age|");

                    while (result.next()) {
                        System.out.println(result.getInt("id") + "     "
                                + result.getString("name") + "     "
                                + result.getInt("age"));
                    }
                    System.out.println();
                    break;

                case 3:
                    sql = "UPDATE users SET age = ? WHERE name = ?";
                    pstmt = connection.prepareStatement(sql);
                    System.out.println("Enter age and enter name where age do you want update:  ");
                    pstmt.setInt(1, scanner.nextInt());
                    pstmt.setString(2, scanner.next());
                    pstmt.executeUpdate();
                    break;

                case 4:
                    sql = "DELETE FROM users WHERE id = ?";
                    pstmt = connection.prepareStatement(sql);
                    System.out.print("Enter that user`s id would you like delete from database:  ");
                    pstmt.setInt(1, scanner.nextInt());
                    pstmt.executeUpdate();
                    break;

                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}



