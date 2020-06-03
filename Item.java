package PGO12;

public class Item {

    private String ID;
    private String name;

    public Item(String ID, String name) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name);
    }
    public String getID() {
        return ID;
    }
}
