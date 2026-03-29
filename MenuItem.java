class MenuItem {

    private String id;
    private String name;
    private double price;
    private int stock;
    private Category category;



    public MenuItem(String name, double price, int stock, Category category, String id) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;

    }


    public MenuItem() {

    }

    public String getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}

    