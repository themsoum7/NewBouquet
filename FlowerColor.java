/**
 * Created by r0bert on 18.10.2016.
 */
public enum FlowerColor {
    BLACK, RED, BLUE, PINK, GREEN, NO_COLOR;

    public String toString() {
        switch (this) {
            case GREEN:
                return "Green";
            case BLACK:
                return "Black";
            case RED:
                return "Red";
            case BLUE:
                return "Blue";
        }
        return null;
    }
}