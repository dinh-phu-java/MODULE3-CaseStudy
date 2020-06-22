package dinhphu.codegym.services;

import dinhphu.codegym.model.User;

import java.util.List;

public interface IUserServices {
    public void insertUser(User user);
    public void editUser(User user);
    public void selectUser(String token);
    public int rowCount();
    public List<User> selectAllUser();
}
