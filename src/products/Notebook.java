package products;

public class Notebook extends Product{
    private int pageCount;
    private boolean isHardCover;
    private static int notebookCounter = 0;

    public Notebook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
    }

    @Override
    public String toString(){
        return super.toString() + " pageCount: " + pageCount + " isHardCover: " + isHardCover;
    }

    @Override
    protected String generateId() {
        notebookCounter++;
        return "2" + String.format("%03d" , notebookCounter);
    }
}
