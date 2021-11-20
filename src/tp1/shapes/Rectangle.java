package tp1.shapes;

public class Rectangle {
    //attributes
    public double length,width;
    //methods

    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public void perimeter(){
        double p=0;
        p=2*(width+length);
        System.out.println("Perimeter : "+p);
    }

    public void surface(){
        double s=0;
        s=width*length;
        System.out.println("Surface : "+s);
    }
}
