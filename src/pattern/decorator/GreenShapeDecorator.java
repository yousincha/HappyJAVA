package pattern.decorator;

public class GreenShapeDecorator extends ShapeDecorator{
    public GreenShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw(){
//        decoraredShape.draw();
        setGreenBorder(decoraredShape);
    }
    private  void setGreenBorder(Shape decoratedShape){
        System.out.println("Green ***************** Start");
        decoratedShape.draw();
        System.out.println("Green ***************** End");
    }
}
