import Inventory.inventory;
import products.Accessory;
import products.Book;
import products.Notebook;
import products.Product;

public class Main {
    public static void main(String[] args) {
        inventory<Book> bookInventory = new inventory<>();
        inventory<Notebook> notebookInventory = new inventory<>();
        inventory<Accessory> accessoryInventory = new inventory<>();

        bookInventory.addItem(new Book("کتاب جنگل", 50.0, "رودیارد کیپلینگ", "انتشارات افراز", "داستان"));
        bookInventory.addItem(new Book("شازده کوچولو", 30.0, "آنتوان دوسنت اگزوپری", "انتشارات چشمه", "فلسفی"));

        notebookInventory.addItem(new Notebook("دفتر 80 برگ", 10.0, 100,false));
        notebookInventory.addItem(new Notebook("دفتر سخت 200 برگ", 25.0, 200, true));

        accessoryInventory.addItem(new Accessory("مداد رنگی", 15.0, "قرمز"));
        accessoryInventory.addItem(new Accessory("خودکار", 5.0, "آبی"));

        System.out.println("کتاب‌ها:");
        bookInventory.displayAll();
        System.out.println("\nدفترها:");
        notebookInventory.displayAll();
        System.out.println("\nلوازم التحریر:");
        accessoryInventory.displayAll();

        bookInventory.removeItemById(1001);
        notebookInventory.removeItemById(2001);

        System.out.println("\nمجموع قیمت کتاب‌ها: " + calculateTotalPrice(bookInventory));
        System.out.println("مجموع قیمت دفترها: " + calculateTotalPrice(notebookInventory));
        System.out.println("مجموع قیمت لوازم التحریر: " + calculateTotalPrice(accessoryInventory));

        Product foundProduct = notebookInventory.findItemById(2002);
        if (foundProduct != null) {
            System.out.println(foundProduct.toString());
        }
        bookInventory.findItemById(9999);

        bookInventory.applyDiscount("شازده کوچولو", 20);
        notebookInventory.applyDiscount("دفتر سخت 200 برگ", 10);

        System.out.println("\n--- محصولات پس از تغییرات ---");
        System.out.println("کتاب‌ها:");
        bookInventory.displayAll();
        System.out.println("\nدفترها:");
        notebookInventory.displayAll();
        System.out.println("\nلوازم التحریر:");
        accessoryInventory.displayAll();

        }
    public static double calculateTotalPrice(inventory<? extends Product> inventory) {
        double total = 0;
        for (Product item : inventory.getItems()) {
            total += item.getPrice();
        }
        return total;
    }
    }
