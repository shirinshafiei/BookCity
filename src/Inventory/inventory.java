package Inventory;

import products.Product;

import java.util.ArrayList;

public class inventory<T extends Product> {
    private ArrayList<T> items = new ArrayList<>();

    public void applyDiscount(String productName, int discount){
        boolean found = false;
        for (T item : items){
            if (item.getTitle().equals(productName)){
                found = true;
                double newPrice = item.getPrice() * (100 - discount) / 100;
                item.setPrice(newPrice);
            }
        }
        if (!found) {
            throw new IllegalArgumentException("محصول با نام موردنظر یافت نشد");
        }
    }

    public void addItem(T product) {
        items.add(product);
    }

    public void removeItemById(int id) {
        boolean found = false;
        for (T item : items) {
            if (item.getId().equals(String.valueOf(id))) {
                items.remove(item);
                found = true;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("آیدی مورد نظر یافت نشد");
        }
    }

    public T findItemById(int id) {
        String searchId = String.valueOf(id);
        for (T item : items) {
            if (item.getId().equals(searchId)) {
                return item;
            }
        }
        System.out.println("خطا: محصول با آیدی " + id + " یافت نشد.");
        return null;
    }

    public void displayAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public ArrayList<T> getItems() {
        return items;
    }
}
