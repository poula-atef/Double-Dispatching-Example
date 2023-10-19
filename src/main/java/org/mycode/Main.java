package org.mycode;

import org.mycode.entities.printers.Printer;
import org.mycode.entities.shapes.Circle;
import org.mycode.entities.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Shape shape = new Circle();

        // wrong usage as compiler won't allow ambiguity and uncertainty
        // about which implementation will be used as we have shape
        // and 4 other children, so it takes the safer path (static binding)
        // and will only use the method with parameter of type shape
        // (it decided to use it in the compilation time)
        printer.print(shape);

        // double dispatch is a trick to prevents the previous behavior
        shape.accept(printer);

    }
}