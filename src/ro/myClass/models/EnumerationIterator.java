package ro.myClass.models;

import java.util.Enumeration;

public class EnumerationIterator  {
IteratorEnumeration enumeration;

    public EnumerationIterator(IteratorEnumeration enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
