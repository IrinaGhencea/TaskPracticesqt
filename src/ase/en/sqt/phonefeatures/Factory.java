package ase.en.sqt.phonefeatures;

public class Factory {
    public Factory() {
    }

    public static AFeature getFeature(Type type, String name, int price){
        switch (type){
            case ANTENNA -> {
                return new Antenna(name, price);
            }
            case SPEAKER -> {
                return new Speaker(name, price);
            }
            case BATTERY -> {
                return new Battery(name, price);
            }
            case COMPASS -> {
                return new Compass(name, price);
            }

            default -> throw new UnsupportedOperationException();
        }
    }


}
