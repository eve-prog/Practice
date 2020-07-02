package com.evma;

public interface ITelephone {
    void powerOn();            //signature (the parameters, the name, the return type)
    void dial(int phoneNumber); //signature (the code itself goes into the class that inherits this interface)
    void answer();              //defining the methods that form this interface
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
