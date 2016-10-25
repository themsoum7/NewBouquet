/**
 * Created by r0bert on 18.10.2016.
 */
public class FlowerSpec {

    protected FlowerColor color = FlowerColor.NO_COLOR;
    protected FlowerType type = FlowerType.NO_FLOWER;
    protected double length = 0;
    protected boolean fresh = false;
    protected double price = 0;

    public FlowerSpec(FlowerType type, double price, double length, boolean fresh, FlowerColor color) {
        this.length = length;
        this.fresh = fresh;
        this.price = price;
        this.type = type;
        this.color = color;
    }

    public FlowerSpec() {
    }

    public double getLength(){
        return length;
    }
    public FlowerColor getColor(){
        return color;
    }
    public FlowerType getType(){
        return type;
    }
    public boolean isFresh(){
        return fresh;
    }
    public double getPrice(){
        return price;
    }
    public boolean matches(FlowerSpec otherSpec){
        if (length != otherSpec.length)
            return false;
        if (fresh != otherSpec.fresh)
            return false;
        if (color != otherSpec.color)
            return false;
        if (type != otherSpec.type)
            return false;
        return true;
    }
}
