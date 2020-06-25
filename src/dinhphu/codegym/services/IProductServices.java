package dinhphu.codegym.services;

import dinhphu.codegym.model.Product;
import dinhphu.codegym.model.User;

import java.util.List;

public interface IProductServices {
    public boolean insertProduct(User user);
    public boolean editProduct(User user);
    public User selectProduct(String token);
    public int rowCount();
    public List<Product> selectAllProduct();

}
