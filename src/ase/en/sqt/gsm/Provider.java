package ase.en.sqt.gsm;


import java.util.HashMap;
import java.util.Map;

public class Provider implements GSMInterface{

    private static Map<String, Provider> gsmconnections;

    private String connection;
    private Provider(String connection){
        this.connection=connection;
        System.out.println(connection);
    }
    static {
        gsmconnections=new HashMap<>();
        gsmconnections.put("URGENT", new Provider("URGENT"));
        gsmconnections.put("REGULAR", new Provider("REGULAR"));
        gsmconnections.put("PRIORITY", new Provider("PRIORITY"));

    }

    public static Provider getInstance(String connection){
        return gsmconnections.get(connection);
    }

    @Override
    public void call() {

    }

    @Override
    public String toString() {
        return "Provider{" +
                "connection='" + connection + '\'' +
                '}';
    }
}
