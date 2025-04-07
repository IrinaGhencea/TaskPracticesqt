package ase.en.sqt.gsm;

public class GSMConnection implements GSMInterface {
    private static GSMConnection instance=null;

    private GSMConnection() {
    }

    public static synchronized GSMConnection getInstance(){
        if(instance==null){
            instance=new GSMConnection();
        }
        return instance;
    }


    @Override
    public void call() {
        System.out.println("gsm connection");

    }
}
