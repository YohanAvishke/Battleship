package Components;

public class Block {
    private String id;
    private boolean isAShip;
    private boolean destroyed;

    public Block(String id, boolean destroyed) {
        this.id = id;
        this.destroyed = destroyed;
    }

    public String getId() {
        return id;
    }

    public void setAShip(boolean AShip) {
        isAShip = AShip;
    }
}
