package repository;

import exceptions.ObjectNotFoundException;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import queries.Queries;

import java.util.List;


@Repository
public class MainRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final Logger logger = LoggerFactory.getLogger(MainRepository.class);


    public List<Product> getAllProducts(){
        logger.info("--Getting all the products from the database");
        List<Product> allProducts = jdbcTemplate.query(Queries.GET_ALL_PRODUCTS, new BeanPropertyRowMapper<>(Product.class));
        return allProducts;
    }

    public Product getProductById(int id){
        logger.info("--Searching for the product with the id: " + id);

        try {
            Product product = (Product) jdbcTemplate.query(Queries.GET_PRODUCT_BY_ID, new BeanPropertyRowMapper<>(Product.class));
            return product;
        }catch (ObjectNotFoundException ex){
            throw new ObjectNotFoundException("Could not identify the product with the id " + id);
        }
    }

    public List<Product> getProductsByCategory(int id){
        logger.info("--Getting all the products from the category " + id);
        try {
            List<Product> allProductsById = jdbcTemplate.query(Queries.GET_PRODUCTS_BY_CATEGORY, new BeanPropertyRowMapper<>(Product.class));
            return allProductsById;
        }catch (ObjectNotFoundException ex){
            throw new ObjectNotFoundException("There are no products in the store for the selected category");
        }
    }

    public Product addProduct(Product product){
        logger.info("--Adding a product into the store");
        jdbcTemplate.update(Queries.ADD_PRODUCT,product.getId(), product.getName(), product.getQuantity(), product.getPrice(), product.getCategoryId());
        return product;
    }

    public List<Product> deleteProduct(int id){
        logger.info("--Deleting the product with the id " + id);

        jdbcTemplate.update(Queries.DELETE_PRODUCT, id);
        return jdbcTemplate.query(Queries.GET_ALL_PRODUCTS, new BeanPropertyRowMapper<>(Product.class));

    }
}
