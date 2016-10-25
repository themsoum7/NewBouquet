/**
 * Created by r0bert on 25.10.2016.
 */
public enum FlowerType {
    TULIP, CHAMOMILE, ROSE, NO_FLOWER;

    public String toString() {
        switch (this) {
            case TULIP:
                return "Tulip";
            case CHAMOMILE:
                return "Chamomile";
            case ROSE:
                return "Rose";
        }
        return null;
    }
}
