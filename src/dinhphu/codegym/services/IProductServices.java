package dinhphu.codegym.services;

import dinhphu.codegym.model.Product;
import dinhphu.codegym.model.User;

import java.util.List;

public interface IProductServices {
    public boolean insertProduct(Product product);
    public boolean editProduct(Product product);
    public Product selectProduct(String token);
    public int rowCount();
    public List<Product> selectAllProduct();

}
