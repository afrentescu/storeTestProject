package model;

public class Category {

    private int categoryId;
    private String name;

    public Category(int id, String name) {
        this.categoryId = id;
        this.name = name;
    }

    public int getId() { return categoryId; }

    public void setId(int id) { this.categoryId = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
