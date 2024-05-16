package pattern.decorator;

import java.awt.*;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw(){
//        decoraredShape.draw();
        setRedBorder(decoraredShape);
    }
    private  void setRedBorder(Shape decoratedShape){
        System.out.println("Red ================= Start");
        decoratedShape.draw();
        System.out.println("Red ================= End");
    }
}
