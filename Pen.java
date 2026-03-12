public class Pen{
    String color;
    float height;
    String name;
    public void write(){
        System.out.println("writing");
    }
    public static void main(String[]args){
        pen=new Pen();
        pen.color="black";
        pen.height=10.5;
        pen.name="cello";
        pen.write();
        pen1=new Pen1();
        
    }
}