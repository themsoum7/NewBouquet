import java.util.Iterator;
import java.util.List;

/**
 * Created by matt on 10/3/16.
 */
public class FlowerMain {

    public static void main(String[] args) {
        FlowerBucket bucket = new FlowerBucket();
        initializeBucket(bucket);

        FlowerSpec findFlower = new FlowerSpec(FlowerType.ROSE, 2, 4, true, FlowerColor.PINK);
        List matchingFlowers = bucket.search(findFlower);
        if (!matchingFlowers.isEmpty()){
            for (Iterator i = matchingFlowers.iterator(); i.hasNext();){
                Flower flower = (Flower) i.next();
                FlowerSpec spec = flower.getSpec();
                System.out.println("FLower: " + spec.getType() + "\n Price: " + spec.getPrice() + " \n Length: "
                        + spec.getLength() + "Color: " + spec.getColor() + "Fresh: " + spec.isFresh());
            }
        }
        else {
            System.out.println("NO FLOWERS!");
        }
    }
    private static void initializeBucket(FlowerBucket bucket) {
        bucket.addFlower(new FlowerSpec(FlowerType.ROSE, 15, 3, false, FlowerColor.GREEN));
        bucket.addFlower(new FlowerSpec(FlowerType.TULIP, 15, 1, true, FlowerColor.RED));
        bucket.addFlower(new FlowerSpec(FlowerType.CHAMOMILE, 5, 2.5, true,FlowerColor.BLUE));
        bucket.addFlower(new FlowerSpec(FlowerType.ROSE, 10, 5, true, FlowerColor.BLUE));
    }

}
