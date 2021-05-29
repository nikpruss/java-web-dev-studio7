package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    public CD() {

    }

    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.\n");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
