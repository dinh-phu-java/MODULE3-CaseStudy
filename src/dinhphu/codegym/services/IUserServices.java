package dinhphu.codegym.services;

import dinhphu.codegym.model.User;

import java.util.List;

public interface IUserServices {
    public boolean insertUser(User user);
    public void editUser(User user);
    public User selectUser(String token);
    public int rowCount();
    public List<User> selectAllUser();
}
