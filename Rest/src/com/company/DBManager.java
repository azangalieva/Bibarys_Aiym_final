package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class DBManager {
    private Connection connection;
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");///
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/restaurant?useUnicode=true&serverTimezone=UTC","root", ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void regClient(Client client){
        try{

            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO clients (id, full_name, username,password,retype_p, gender, phone, district) " +
                    "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?)"
            );
            statement.setString(1, client.getFull_name());
            statement.setString(2, client.getUsername());
            statement.setString(3, client.getPassword());
            statement.setString(4, client.getRetype_p());
            statement.setString(5, client.getGender());
            statement.setString(6, client.getPhone());
            statement.setString(7, client.getDistrict());

            statement.executeUpdate();// Insert, Delete, Update

            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Client> getAllClients(){
        ArrayList<Client> clientList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM clients");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String full_name = resultSet.getString("full_name");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String retype_p = resultSet.getString("retype_p");
                String gender = resultSet.getString("gender");
                String phone = resultSet.getString("phone");
                String district = resultSet.getString("district");

                clientList.add(new Client(id,full_name, username,password,retype_p ,gender, phone,district));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clientList;
    }
}
