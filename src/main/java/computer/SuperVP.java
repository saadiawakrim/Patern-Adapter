package computer;

public class SuperVP implements Vga, Hdmi{
    @Override
    public void view(byte[] data) {
        String mesg = new String(data);
        System.out.println("...........Super VP HDMI..........");
        System.out.println(mesg);
        System.out.println("...........Super VP HDMI..........");
    }

    @Override
    public void print(String mesg) {
        System.out.println("...........Super VP VGA..........");
        System.out.println(mesg);
        System.out.println("...........Super VP VGA..........");
    }
}
