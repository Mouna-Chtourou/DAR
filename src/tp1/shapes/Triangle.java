package tp1.shapes;

public class Triangle {
    //attributes
    public int side1;
    public int side2;
    public int side3;
    public int hauteur;

    //methods
    public void perimeter(){
        int p=0;
        p=side1+side2+side3;
        System.out.println("Perimeter : "+p);
    }

    public void surface(){
        int s=0;
        s=(side1*hauteur)/2;
        System.out.println("Surface : "+s);
    }
}

