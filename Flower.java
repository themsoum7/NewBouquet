/**
 * Created by matt on 10/3/16.
 */
public class Flower extends FlowerSpec {
    protected FlowerSpec spec;

    protected double length;
    protected boolean fresh;
    protected double price;
    protected String type;

    public Flower(FlowerSpec spec) {
        this.spec = spec;
    }
    public double getPrice() {
        return spec.price;
    }
    public double getLength() {
        return spec.length;
    }
    public FlowerColor getColor() {
        return spec.color;
    }
    public boolean isFresh() {
        return spec.isFresh();
    }
    public FlowerSpec getSpec() {
        return spec;
    }
}
