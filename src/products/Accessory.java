package products;

public class Accessory extends Product{
    private String color;
    private static int accessoryCounter = 0;

    public Accessory(String title, Double price, String color){
        super(title,price);
        this.color = color;
    }

    @Override
    protected String generateId() {
        accessoryCounter++;
        return "3" + String.format("%03d", accessoryCounter);
    }

    @Override
    public String toString(){
        return super.toString() + " color: " + color;
    }
}
