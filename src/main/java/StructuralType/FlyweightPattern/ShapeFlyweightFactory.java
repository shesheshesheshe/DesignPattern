package StructuralType.FlyweightPattern;

import java.util.HashMap;
import java.util.List;

public class ShapeFlyweightFactory {

    private static final HashMap circleMap = new HashMap();
    private static ShapeFlyweightFactory FACTORY = new ShapeFlyweightFactory();
    public static ShapeFlyweightFactory getShapeFactory() {
        return FACTORY;
    }

    public ShapeFlyweight getCircle(String color) {
        CircleShapeConcreteFlyweight circle = (CircleShapeConcreteFlyweight) circleMap.get(color);

        if (circle == null) {
            circle = new CircleShapeConcreteFlyweight(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

    public ShapesUnsharableFlyweight getCircles(List<String> keyList) {
        ShapesUnsharableFlyweight shapes = new ShapesUnsharableFlyweight();
        for (String key : keyList) {
            shapes.add(key, this.getCircle(key));
        }
        return shapes;
    }
}