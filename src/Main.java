import ase.en.sqt.os.OperatingSystem;
import ase.en.sqt.phonebuilder.Phone;
import ase.en.sqt.phonebuilder.PhoneBuilder;
import ase.en.sqt.phonefeatures.Compass;
import ase.en.sqt.phonefeatures.Factory;
import ase.en.sqt.phonefeatures.Type;
import ase.en.sqt.gsm.GSMConnection;
import ase.en.sqt.gsm.Provider;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
        Compass compass= (Compass) Factory.getFeature(Type.COMPASS, "compas", 12);
        System.out.println(compass);

        //2
        for(int i=0;i<10;i++){
            new Thread(()->{
                GSMConnection gsmConnection=GSMConnection.getInstance();
                gsmConnection.call();
            }
            ).start();
        }

        //3
        Provider providerU=Provider.getInstance("URGENT");

        Provider providerR=Provider.getInstance("REGULAR");

        Provider providerP=Provider.getInstance("PRIORITY");
        providerU.call();
        providerR.call();
        providerP.call();

        //4

        Phone simplePhone= new PhoneBuilder(123).build();
        Phone complexPhone= new PhoneBuilder(234).addAntenna("with antenna", 10000).build();
        System.out.println(simplePhone);
        System.out.println(complexPhone);

//5
        OperatingSystem operatingSystem1=new OperatingSystem("version1");
        operatingSystem1.run();

        OperatingSystem clone=null;
        try{
            clone= (OperatingSystem) operatingSystem1.clone();

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        clone.run();

        operatingSystem1.setVersion("other_version1");
        operatingSystem1.run();
        clone.setVersion("other_version2");
        clone.run();



    }
}
