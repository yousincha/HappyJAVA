package pattern.decorator;

public abstract class ShapeDecorator extends Shape {
    protected Shape decoraredShape;

    public ShapeDecorator(Shape decoraredShape){this.decoraredShape = decoraredShape;}
    public void draw(){decoraredShape.draw();}
}
