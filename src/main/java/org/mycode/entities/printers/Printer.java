package org.mycode.entities.printers;

import org.mycode.entities.shapes.Circle;
import org.mycode.entities.shapes.Shape;
import org.mycode.entities.shapes.Square;

public class Printer {
    public void print(Shape shape){
        System.out.println("This Is Shape !!!");
    }

    public void print(Circle circle){
        System.out.println("This Is Circle !!!");
    }

    public void print(Square square){
        System.out.println("This Is Square !!!");
    }
}
