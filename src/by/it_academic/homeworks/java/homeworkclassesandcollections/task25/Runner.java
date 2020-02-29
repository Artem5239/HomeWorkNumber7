package by.it_academic.homeworks.java.homeworkclassesandcollections.task25;

public class Runner {
    public static void main (String[] args) {
           TurningOn iceBox = new IceBox("Patriot");
            iceBox.turnOn();
            TurningOn washer = new Washer("Bosh");
            washer.turnOn();
        }

        static class IceBox extends Household implements TurningOn {

            public IceBox(String name) {
                super(name);

            }

             @Override
            public void turnOn() {
                System.out.println(this+" plugged in");
            }
        }

        static class Washer extends Household implements TurningOn {

            public Washer(String name) {
                super(name);
            }

            @Override
            public void turnOn() {System.out.println(this+" plugged off");

            }
        }}


