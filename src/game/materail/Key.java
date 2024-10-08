
package game.materail;

public class Key {

    public boolean isKey_enter() {
        return key_enter;
    }
    
    public void setKey_enter(boolean key_enter) {
        this.key_enter = key_enter;
    }

    public boolean isKey_right() {
        return Key_right;
    }

    public void setKey_right(boolean Key_right) {
        this.Key_right = Key_right;
    }

    public boolean isKey_left() {
        return Key_left;
    }

    public void setKey_left(boolean Key_left) {
        this.Key_left = Key_left;
    }

    public boolean isKey_space() {
        return Key_space;
    }

    public void setKey_space(boolean Key_space) {
        this.Key_space = Key_space;
    }

    public boolean isKey_j() {
        return Key_j;
    }

    public void setKey_j(boolean Key_j) {
        this.Key_j = Key_j;
    }

    public boolean isKey_k() {
        return Key_k;
    }

    public void setKey_k(boolean Key_k) {
        this.Key_k = Key_k;
    }
    
    private boolean Key_right;
    private boolean Key_left;
    private boolean Key_space;
    private boolean Key_j;
    private boolean Key_k;
    private boolean key_enter;
}
