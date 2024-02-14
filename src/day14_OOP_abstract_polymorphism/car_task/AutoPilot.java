package day14_OOP_abstract_polymorphism.car_task;

public interface AutoPilot extends AutoPark {

    boolean hasAutoPilot = true;

    void selfDrive();

}


/* Create a Child Interface of AutoPark Named 'AutoPilot':
    - Note: Use the 'extends' keyword for inheritance.
    - Variables:
        - hasAutoPilot
    - Abstract Method:
        - selfDrive() */