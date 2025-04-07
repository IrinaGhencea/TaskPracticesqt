package ase.en.sqt.phonebuilder;

import ase.en.sqt.phonefeatures.Antenna;
import ase.en.sqt.phonefeatures.Battery;
import ase.en.sqt.phonefeatures.Compass;
import ase.en.sqt.phonefeatures.Speaker;

public class Phone {
    int id;
    Speaker speaker;
    Battery battery; // example
    Antenna antenna;
    Compass compass;

    public Phone(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", speaker=" + speaker +
                ", battery=" + battery +
                ", antenna=" + antenna +
                ", compass=" + compass +
                '}';
    }
}

