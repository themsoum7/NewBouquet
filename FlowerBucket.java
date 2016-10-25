/**
 * Created by matt on 10/3/16.
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FlowerBucket extends FlowerSpec{
   private List bouquet;

   public FlowerBucket(){
       bouquet = new LinkedList();
   }
   public void addFlower(FlowerSpec spec){
       Flower flower = new Flower(spec);
       bouquet.add(flower);
   }
   public List search(FlowerSpec searchFlower){
       List matchingFlowers = new LinkedList();
       for (Iterator i = bouquet.iterator(); i.hasNext(); ) {
           Flower flower = (Flower)i.next();
           if(flower.getSpec().matches(searchFlower)){
               matchingFlowers.add(flower);
           }
       }
       return matchingFlowers;
   }
}