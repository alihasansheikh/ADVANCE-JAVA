package org.example;


import java.io.Serializable;
//Serialization = converting an object into a byte stream.
//
//Purpose: store object in a file or send over network.
//
//Deserialization = converting byte stream back to an object.
public class Serialization implements Serializable {

    private static final long serialVersionUID=1l;

    int a;
    String b;
    transient int c; // transient means this will not be serialized
}
