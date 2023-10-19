package org.mycode.entities.shapes;

import org.mycode.entities.printers.Printer;

public class Square extends Shape{
    @Override
    public void accept(Printer printer) {
        printer.print(this);
    }
}
