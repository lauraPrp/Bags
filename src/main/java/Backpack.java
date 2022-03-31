import java.util.ArrayList;

public class Backpack {
    private ArrayList<String> items;
   public Backpack(){
       items = new ArrayList<String>();
   }
   public void addItem(String item){
       items.add(item);
   }

   public ArrayList<String> getItems(){
       return items;
   }
   public int getSize(){
       return items.size();
   }
}