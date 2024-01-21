package computer;

public class VideoProjecteur implements Vga{
    @Override
    public void print(String mesg) {
        System.out.println("*****************VP***************");
        System.out.println(mesg);
        System.out.println("*****************/VP***************");
    }
}
