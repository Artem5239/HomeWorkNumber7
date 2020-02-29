package by.it_academic.homeworks.java.homeworkclassesandcollections.task25;

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

