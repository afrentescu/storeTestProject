package queries;

public class Queries {

    public static final String GET_ALL_PRODUCTS = "select * from products";
    public static final String GET_PRODUCT_BY_ID = "select product.name, product.id from product where product.id = ?";
    public static final String GET_PRODUCTS_BY_CATEGORY = "SELECT * from product join category on product.categoryId = category.id where category.id = ?";

    public static final String ADD_PRODUCT = "INSERT INTO product (id, name, quantity, price, categoryId) VALUES (null, ?,?,?,?)";
    public static final String DELETE_PRODUCT = "delete from product where id = ?";
}
