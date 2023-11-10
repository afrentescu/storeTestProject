package model;

public class Product {

    private int id;
    private String name;
    private long quantity;
    private float price;
    private int categoryId;

    public Product(int id, String name, long quantity, float price, int categoryId) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.categoryId = categoryId;
    }
    public Product( String name, long quantity, float price, int categoryId) {

        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.categoryId = categoryId;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public long getQuantity() { return quantity; }

    public void setQuantity(long quantity) { this.quantity = quantity; }

    public float getPrice() { return price; }

    public void setPrice(float price) { this.price = price; }

    public int getCategoryId() { return categoryId; }

    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }
}
