package org.mycode.entities.shapes;

import org.mycode.entities.printers.Printer;

public class Circle extends Shape {
    @Override
    public void accept(Printer printer) {
        printer.print(this);
    }
}
