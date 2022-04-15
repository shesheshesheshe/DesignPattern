package StructuralType.FlyweightPattern;

import java.util.ArrayList;
import java.util.List;

public class FlyweightPatternDemo {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {
        ShapeFlyweightFactory factory = ShapeFlyweightFactory.getShapeFactory();

//        for(int i=0; i < 5; ++i) {
//            CircleShapeConcreteFlyweight circle = (CircleShapeConcreteFlyweight)factory.getCircle(getRandomColor());
//            circle.setX(getRandomX());
//            circle.setY(getRandomY());
//            circle.setRadius(100);
//            circle.draw();
//        }


        List<String> keyList = new ArrayList<>();
        keyList.add(getRandomColor());
        keyList.add(getRandomColor());
        ShapesUnsharableFlyweight circles1 = (ShapesUnsharableFlyweight)factory.getCircles(keyList);
        ShapesUnsharableFlyweight circles2 = (ShapesUnsharableFlyweight)factory.getCircles(keyList);
        System.out.print("circles1 == circles2? ");
        System.out.println(circles1 == circles2);
        circles1.draw();
        circles2.draw();
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}