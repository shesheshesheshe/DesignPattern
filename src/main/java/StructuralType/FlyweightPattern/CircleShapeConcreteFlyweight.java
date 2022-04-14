package StructuralType.FlyweightPattern;

public class CircleShapeConcreteFlyweight implements ShapeFlyweight {
    private String color;
    private int x;
    private int y;
    private int radius;

    public CircleShapeConcreteFlyweight(String color){
        this.color = color;
    }

    public void setX(int x) {
        try{
            this.x = x;
        }
        catch (Exception exo) {
            x = 0;
        }

    }

    public void setY(int y) {
        try{
            this.y = y;
        }
        catch (Exception exo) {
            x = 0;
        }
    }

    public void setRadius(int radius) {
        try{
            this.radius = radius;
        }
        catch (Exception exo) {
            x = 0;
        }
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }

}
