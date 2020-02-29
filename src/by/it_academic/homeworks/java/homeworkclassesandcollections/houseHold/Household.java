package by.it_academic.homeworks.java.homeworkclassesandcollections.houseHold;

abstract class Household {
    String name;

    public Household(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return name + " - ";
    }
}

