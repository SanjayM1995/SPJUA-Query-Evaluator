package edu.buffalo.www.cse4562;


public interface Iterator_Interface {
    Tuple readOneTuple();
    Iterator_Interface getChild();
    void reset();
}
