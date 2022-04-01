import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Organizer {
    private Backpack backpack;
    private Bag[] bags;


    public Organizer() {
        backpack = new Backpack();
        bags = new Bag[]{new Bag(Categories.METALS.getName()), new Bag(Categories.WEAPONS.getName()),
                new Bag("Uncategorized"), new Bag("Uncategorized")};
    }


    public Bag[] getBags() {
        return bags;
    }

    public Backpack getBackPack() {
        return backpack;
    }

    public void addItem(String item) {

        if (this.getBackPack().getSize() < 8) {
            this.getBackPack().addItem(item);
        } else {
            //check bags
            Bag[] tempBags = this.getBags();
            for (int i = 0; i < tempBags.length; i++) {
                if (!tempBags[i].isFull()) {
                    tempBags[i].addItemToBag(item);
                    break;
                } else if (i == tempBags.length - 1) {
                    throw new IllegalStateException("No more room in the backpack for :" + item);
                }

            }
        }
    }


    public void organize() {

        //organizes bags
        //create arraylist of all the items in the backpack and bags
        //moving each item to the appropriate bag
        ArrayList<String> allItems = new ArrayList<>();
        allItems.addAll(this.getBackPack().getItems());
        allItems.addAll(this.getBags()[0].getItems());
        allItems.addAll(this.getBags()[1].getItems());
        allItems.addAll(this.getBags()[2].getItems());
        allItems.addAll(this.getBags()[3].getItems());
        this.getBackPack().getItems().clear();
        this.getBags()[0].getItems().clear();
        this.getBags()[1].getItems().clear();
        this.getBags()[2].getItems().clear();
        this.getBags()[3].getItems().clear();
        //tidying up the bags
        for (String item : allItems) {
            if (!this.getBags()[0].isFull() &&
                    Arrays.asList(Categories.METALS.getSubcategories()).contains(item)) {
                this.getBags()[0].addItemToBag(item);
            } else if (!this.getBags()[1].isFull() &&
                    Arrays.asList(Categories.WEAPONS.getSubcategories()).contains(item)) {
                this.getBags()[1].addItemToBag(item);
            } else if (!this.getBackPack().isFull()) {
                this.getBackPack().addItem(item);
            } else if (!this.getBags()[2].isFull()) {
                this.getBags()[2].addItemToBag(item);
            } else if (!this.getBags()[3].isFull()) {
                this.getBags()[3].addItemToBag(item);
            } else {
                throw new IllegalStateException("You shouldnt be here, NEVER " + item);
            }
            Collections.sort(this.getBackPack().getItems());
            Collections.sort(this.getBags()[0].getItems());
            Collections.sort(this.getBags()[1].getItems());
            Collections.sort(this.getBags()[2].getItems());
            Collections.sort(this.getBags()[3].getItems());

        }
    }
}
