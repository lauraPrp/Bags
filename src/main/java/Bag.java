import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bag {


    private String category;
    private int maxCapacity;


    private ArrayList<String> items;

    public Bag(String category) {
        maxCapacity = 4;
        items = new ArrayList<String>();
        this.category = category;

    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void addItemToBag(String item) {
        if (!isFull()) {
            items.add(item);
        }
    }

    public boolean isFull() {
        return items.size() == maxCapacity;
    }

    public String getCategory() {
        return category;
    }
}
