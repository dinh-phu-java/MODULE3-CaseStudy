package dinhphu.codegym.services;

import dinhphu.codegym.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserServices implements IUserServices{
    private static final String dbURL= "jdbc:mysql://localhost:3306/carcompany";
    private static final String userHost="root";
    private static final String passwordHost="qazWSX1@";
    private static final String selectAllUserStatement="select * from users";
    public Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(dbURL,userHost,passwordHost);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    @Override
    public void insertUser(User user) {

    }

    @Override
    public void editUser(User user) {

    }

    @Override
    public void selectUser(String token) {

    }
    @Override
    public int rowCount(){
        int rowCount=-1;
        Connection connection=getConnection();
        String sqlStatement = "select count(*) as row_count from users";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sqlStatement);

            ResultSet rs=preparedStatement.executeQuery();

            while(rs.next()){
                rowCount=Integer.parseInt(rs.getString("row_count"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowCount;
    }
    @Override
    public List<User> selectAllUser(){
        ArrayList<User> userList= new ArrayList<>();
        Connection connection=getConnection();
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(selectAllUserStatement);
            ResultSet rs= preparedStatement.executeQuery();
            while(rs.next()){
                User user=new User(rs.getInt("user_id"),rs.getString("username"),rs.getString("password"),rs.getString("email"),rs.getString("address"));
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }
}
