package GuitarShop02.src;

public enum Wood {
    CEDAR, MAHOGANY, ALDER;

    public String toString(){

        switch (this)
        {
            case CEDAR: return "Cedar";
            case MAHOGANY: return "Mahogany";
            case ALDER: return "Alder";
            default: return "Cedar";
        }
    }
}
