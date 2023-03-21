package org.example.abstract_class_and_interface.homework_5;

public class Child1 extends Base {

    /**
     * This method calling parent method.
     */
    @Override
    public void enable() {
        super.enable();
        System.out.println("Hello from Child1");
    }
}
