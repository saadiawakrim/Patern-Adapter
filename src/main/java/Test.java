import adapter.HdmiVgaAdapter;
import adapter.HdmiVgaAdapterH;
import computer.*;

public class Test {
    public static void main(String[] args) {
        UniteCentre uniteCentre = new UniteCentre();

        uniteCentre.setVga(new Ecran());
        uniteCentre.print("Bonjour");

        uniteCentre.setVga(new VideoProjecteur());
        uniteCentre.print("Bonjour");

        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);
        uniteCentre.print("Bonjour ISGA DWM");

        HdmiVgaAdapterH hdmiVgaAdapterH = new HdmiVgaAdapterH();
        uniteCentre.setVga(hdmiVgaAdapterH);
        uniteCentre.print("Test ISGA DWM Heritage");

        uniteCentre.setVga(new SuperVP());
        uniteCentre.print("Hello");

        HdmiVgaAdapter hdmiVgaAdapter1 = new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentre.setVga(hdmiVgaAdapter1);
        uniteCentre.print("Bonsoir");


    }
}
