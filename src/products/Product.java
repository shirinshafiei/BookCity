package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;

    public Product(String title, Double price){
        this.title = title;
        this.price = price;
        id = generateId();
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "id: " + id + " title: " + title + " price: " + price;
    }

    protected abstract String generateId();
}
