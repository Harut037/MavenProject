package org.example.abstract_class_and_interface.homework_8;

public  abstract class Abstract {

    public Abstract() {
        System.out.println("This is constructor of abstract class");
    }

    public abstract void a_method();

    public void non_abstract_method(){
        System.out.println("This is a normal method of abstract class");
    }
}
