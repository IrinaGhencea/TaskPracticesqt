package ase.en.sqt.os;

public class OperatingSystem implements IOperatingSystem, Cloneable {
    String version="";

    public OperatingSystem(String version){
        this.version = version;

    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public void run() {
        System.out.println(version);
    }



    @Override
    public Object clone() throws CloneNotSupportedException {
        OperatingSystem clone= (OperatingSystem) super.clone();
        clone.version=this.version;
        return clone;

    }


}
