import java.util.ArrayList;

public class Backpack {
    private ArrayList<String> items;

    public Backpack() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public int getSize() {
        return items.size();
    }

    public boolean isFull() {
        return items.size() >= 8;
    }
}