package ase.en.sqt.phonefeatures;

public abstract class AFeature {
    String name;
    int price;

    public AFeature(String name, int price) {
        this.name = name;
        this.price = price;

    }

    @Override
    public String toString() {
        return "AFeature{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
