package Components;

public class Block {
    private String id;
    private boolean clicked;

    public Block(String id, boolean clicked) {
        this.id = id;
        this.clicked = clicked;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

}
