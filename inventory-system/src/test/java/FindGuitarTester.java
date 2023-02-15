import com.practice.inventory.Guitar;
import com.practice.inventory.Inventory;
import com.practice.inventory.enums.Builder;
import com.practice.inventory.enums.Wood;
import com.practice.inventory.enums.Type;

public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes =  new Guitar("", 112.2, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        Guitar guitar = inventory.searchGuitar(whatErinLikes);
        if(guitar != null) {
            System.out.println(" Erin, you might like this " + guitar.getBuilder() + " " + guitar.getModel() + " " + guitar.getType() + " guitar:\n " + guitar.getBackwood() + " back and sides \n " + guitar.getTopWood() + " top.\n You can have it for $" + guitar.getPrice() + "!");
        }else {
            System.out.println("Sorry, Erin, We have nothing for you!");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitars("V95693",1499.2,Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
    }
}
