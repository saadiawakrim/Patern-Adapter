package computer;

public class UniteCentre implements Vga {
    private Vga vga;

    public void print(String mesg){
        System.out.println("***************UniteCentral****************");
        vga.print(mesg);
        System.out.println("***************/UniteCentral****************");
    }

    public void setVga(Vga vga){
        this.vga=vga;

    }
}
