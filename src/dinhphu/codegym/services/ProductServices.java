package dinhphu.codegym.services;

import dinhphu.codegym.model.Product;
import dinhphu.codegym.model.User;

import java.util.List;

public class ProductServices implements IProductServices{

    @Override
    public boolean insertProduct(User user) {
        return false;
    }

    @Override
    public boolean editProduct(User user) {
        return false;
    }

    @Override
    public User selectProduct(String token) {
        return null;
    }

    @Override
    public int rowCount() {
        return 0;
    }

    @Override
    public List<Product> selectAllProduct() {
        return null;
    }
}
