package GuitarShop02.src;

public enum Type {
    ELECTRIC, ACOUSTIC;

    public String toString(){

        switch (this)
        {
            case ELECTRIC: return "Electric";
            case ACOUSTIC: return "Acoustic";
            default: return "Electric";
        }
    }
}

