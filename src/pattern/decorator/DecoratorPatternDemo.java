package pattern.decorator;

import java.awt.*;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class DecoratorPatternDemo {
    public static void main(String[] args) throws Exception {
//     Circle circle = new Circle();
//
//     RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
//     redShapeDecorator.draw();
//
//     GreenShapeDecorator greenShapeDecorator = new GreenShapeDecorator(redShapeDecorator);
//     greenShapeDecorator.draw();
//
     Shape shape = new GreenShapeDecorator(new RedShapeDecorator(new Circle()));
     shape.draw();

     // Shape ==> InputStream (추상클래스)
     // Rectangle ==> FileInputStream
     // RedShapeDecorator ==> DataInputStream
     InputStream in = new DataInputStream(new FileInputStream("./tmp/a.txt"));
    }
}
