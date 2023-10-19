package org.mycode.entities.shapes;

import org.mycode.entities.printers.Printer;

public abstract class Shape {
    abstract public void accept(Printer printer);
}
