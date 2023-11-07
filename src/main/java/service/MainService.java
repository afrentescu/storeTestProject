package service;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.MainRepository;

import java.util.List;

@Service
public class MainService {

    @Autowired
    private MainRepository mainRepository;

    public List<Product> getAllProducts() {
       return mainRepository.getAllProducts();
    }

    public Product getProductById(int id){
        return  mainRepository.getProductById(id);
    }

    public List<Product> getProductsByCategory(int id){
        return  mainRepository.getProductsByCategory(id);
    }

    public Product addProduct(Product product){
        return  mainRepository.addProduct(product);
    }

    public List<Product> deleteProduct(int id){
        return mainRepository.deleteProduct(id);
    }
}
