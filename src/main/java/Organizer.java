import java.util.ArrayList;

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
                Bag bag = tempBags[i];
                if (!bag.isFull()) {
                    bag.addItemToBag(item);
                    tempBags[i] = bag;
                    break;
                }
            }
        }
    }


    public void organize() {
        //organizes bags
        //start organizing metals bag
        //then weapons bag
        //then backpacks

    }
}
