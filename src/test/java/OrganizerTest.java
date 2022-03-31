import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrganizerTest {
    Organizer organizer;

    @BeforeEach
    void setUp() {
        organizer = new Organizer();
    }

    @Test
    void shouldHaveEmptyBackpackAndFourBAgs() {
        assertEquals(0, organizer.getBackPack().getItems().size());
        assertEquals(4, organizer.getBags().length);
    }

    @Test
    void shouldAddFirstItemToBackPack() {
        String firstItem = "firstItem";
        organizer.addItem(firstItem);
        assertEquals(1, organizer.getBackPack().getItems().size());
        assertEquals(firstItem, organizer.getBackPack().getItems().get(0));
        assertEquals(0, organizer.getBags()[0].getItems().size());
    }

    @Test
    void shouldAddEightItemToBackPack() {
        String firstItem = "firstItem";
        String secondItem = "secondItem";
        String thirdItem = "thirdItem";
        String fourthItem = "fourthItem";
        String fifthItem = "fifthItem";
        String sixthItem = "sixthItem";
        String seventhItem = "seventhItem";
        String eighthItem = "eighthItem";
        organizer.addItem(firstItem);
        organizer.addItem(secondItem);
        organizer.addItem(thirdItem);
        organizer.addItem(fourthItem);
        organizer.addItem(fifthItem);
        organizer.addItem(sixthItem);
        organizer.addItem(seventhItem);
        organizer.addItem(eighthItem);
        assertEquals(8, organizer.getBackPack().getItems().size());
        assertEquals(firstItem, organizer.getBackPack().getItems().get(0));
        assertEquals(secondItem, organizer.getBackPack().getItems().get(1));
        assertEquals(thirdItem, organizer.getBackPack().getItems().get(2));
        assertEquals(fourthItem, organizer.getBackPack().getItems().get(3));
        assertEquals(fifthItem, organizer.getBackPack().getItems().get(4));
        assertEquals(sixthItem, organizer.getBackPack().getItems().get(5));
        assertEquals(seventhItem, organizer.getBackPack().getItems().get(6));
        assertEquals(eighthItem, organizer.getBackPack().getItems().get(7));
        assertEquals(0, organizer.getBags()[0].getItems().size());
        assertEquals(0, organizer.getBags()[1].getItems().size());
        assertEquals(0, organizer.getBags()[2].getItems().size());
        assertEquals(0, organizer.getBags()[3].getItems().size());

    }

    @Test
    void shouldAdd8ItemsInTheBAckPAckAndTwoToTheBag() {
        organizer.addItem("firstItem");
        organizer.addItem("secondItem");
        organizer.addItem("thirdItem");
        organizer.addItem("fourthItem");
        organizer.addItem("fifthItem");
        organizer.addItem("sixthItem");
        organizer.addItem("seventhItem");
        organizer.addItem("eighthItem");
        organizer.addItem("ninthItem");
        organizer.addItem("tenthItem");
        assertEquals(8, organizer.getBackPack().getItems().size());
        assertEquals(2, organizer.getBags()[0].getItems().size());
    }

    @Test
    void shouldAdd12ItemsFillingBAckPackAndABag() {
        organizer.addItem(Categories.METALS.getSubcategories()[0]);
        organizer.addItem(Categories.METALS.getSubcategories()[1]);
        organizer.addItem(Categories.METALS.getSubcategories()[2]);
        organizer.addItem(Categories.METALS.getSubcategories()[3]);
        organizer.addItem(Categories.CLOTHES.getSubcategories()[0]);
        organizer.addItem(Categories.CLOTHES.getSubcategories()[1]);
        organizer.addItem(Categories.CLOTHES.getSubcategories()[2]);
        organizer.addItem(Categories.WEAPONS.getSubcategories()[0]);
        organizer.addItem(Categories.WEAPONS.getSubcategories()[1]);
        organizer.addItem(Categories.WEAPONS.getSubcategories()[2]);
        organizer.addItem(Categories.WEAPONS.getSubcategories()[3]);
        organizer.addItem(Categories.HERBS.getSubcategories()[0]);

        assertEquals(8, organizer.getBackPack().getItems().size());
        assertEquals(4, organizer.getBags()[0].getItems().size());
    }

    @Test
    void shouldOrganize12ItemsIn2CategorizedBagsAndBackPack() {
        //arrange
        organizer.addItem(Categories.METALS.getSubcategories()[0]);
        organizer.addItem(Categories.METALS.getSubcategories()[1]);
        organizer.addItem(Categories.METALS.getSubcategories()[2]);
        organizer.addItem(Categories.METALS.getSubcategories()[3]);

        organizer.addItem(Categories.CLOTHES.getSubcategories()[0]);
        organizer.addItem(Categories.CLOTHES.getSubcategories()[1]);
        organizer.addItem(Categories.CLOTHES.getSubcategories()[2]);

        organizer.addItem(Categories.WEAPONS.getSubcategories()[0]);
        organizer.addItem(Categories.WEAPONS.getSubcategories()[1]);
        organizer.addItem(Categories.WEAPONS.getSubcategories()[2]);
        organizer.addItem(Categories.WEAPONS.getSubcategories()[3]);

        organizer.addItem(Categories.HERBS.getSubcategories()[0]);
//act
        organizer.organize();

//assert
        Bag metalsBag = organizer.getBags()[0];
        Bag weaponsBag = organizer.getBags()[1];
        assertEquals(4, metalsBag.getItems().size());
        assertEquals(4, weaponsBag.getItems().size());
        assertEquals(4, organizer.getBackPack().getItems().size());


    }
}



