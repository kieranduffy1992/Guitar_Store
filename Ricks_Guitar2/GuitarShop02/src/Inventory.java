package GuitarShop02.src;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Inventory {

    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec){
        Guitar guitar = new Guitar(serialNumber,price,spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator i = guitars.iterator(); ((Iterator) i).hasNext();){
            Guitar guitar = (Guitar)i.next();
            if(guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchSpec) {

        List matchingGuitars = new LinkedList<>();

        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            GuitarSpec guitarSpec = guitar.getSpec();
            //ignore serialNumber since it is unique
            //ignore price since it is irrelevant

            if(searchSpec.getBuilder() != guitarSpec.getBuilder()){
                continue;
            }

            String model = searchSpec.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(guitarSpec.getModel().toLowerCase())))
                continue;

            if(searchSpec.getType() != guitarSpec.getType()){
                continue;
            }

            if(searchSpec.getBackwood() != guitarSpec.getBackwood()){
                continue;
            }

            if(searchSpec.getTopwood() != guitarSpec.getTopwood()){
                continue;
            }

            matchingGuitars.add(guitar);

        }
        return matchingGuitars;
    }
}
