package StructuralType.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class ShapesUnsharableFlyweight implements ShapeFlyweight {
    private Map<String, ShapeFlyweight> shapes = new HashMap<>();

    @Override
    public void draw() {
        for (Map.Entry<String, ShapeFlyweight> entry : shapes.entrySet()) {
            entry.getValue().draw();
        }
    }
    public void add(String key, ShapeFlyweight shape) {
        shapes.put(key, shape);
    }
    public void remove(String type) {
        shapes.remove(type);
    }
}
