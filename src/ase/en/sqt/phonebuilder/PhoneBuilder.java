package ase.en.sqt.phonebuilder;

import ase.en.sqt.phonefeatures.*;

public class PhoneBuilder {
    private Phone phone;


    public PhoneBuilder(int id) {
        this.phone = new Phone(id);
    }

    public PhoneBuilder addSpeaker(String name, int price) {
        this.phone.speaker= (Speaker) Factory.getFeature(Type.SPEAKER, name, price);
        return this;
    }

    public PhoneBuilder addBattery(String name, int price) {
        this.phone.battery= (Battery) Factory.getFeature(Type.BATTERY, name, price);
        return this;
    }

    public PhoneBuilder addAntenna(String name, int price) {
        this.phone.antenna= (Antenna) Factory.getFeature(Type.ANTENNA, name, price);
        return this;
    }

    public PhoneBuilder addCompass(String name, int price) {
        this.phone.compass= (Compass) Factory.getFeature(Type.COMPASS, name, price);
        return this;    }

    public Phone build(){
        return this.phone;
    }
}
