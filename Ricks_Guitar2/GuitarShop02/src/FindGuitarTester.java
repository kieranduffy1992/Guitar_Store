package GuitarShop02.src;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        GuitarSpec whatLookingFor = new GuitarSpec(Builder.FENDER, "Stratocastor",
                Type.ELECTRIC,  Wood.ALDER,Wood.ALDER);

        List matchingGuitars = inventory.search(whatLookingFor);

        if (matchingGuitars != null)
        {
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar) i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println("You might like this:\n " +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + " guitar:\n \t\t" +
                        spec.getBackwood() + " back and side,\n \t\t" +
                        spec.getTopwood() + " top.\n \t\tThe price is only £" +
                        guitar.getPrice());
            }
        }
        else
            {
            System.out.println("Sorry, Nothing found!!");
            }

    }

    public static void initialiseInventory(Inventory inventory){
        //add guitars to the inventory
        inventory.addGuitar("V00001",
                1499.99,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER,
                        Wood.ALDER));

        inventory.addGuitar("V00002",
                1099.99,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER,
                        Wood.ALDER));

        inventory.addGuitar("V00003",
                1699.99,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.CEDAR,
                        Wood.CEDAR));

    }
}
