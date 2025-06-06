package ex001;

public class Retangule {
    public double width, height;

    public double area(){
        return width*height;
    }

    public double perimeter(){
        return width*2 + height*2;
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
