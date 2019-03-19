package UdemyJavaCourse.Section7.PolymorphismChallenge;

public class Car {

    private int cylinders;
    private boolean engine;
    private int wheels;
    private int windows;
    private int doors;

    public Car(int cylinders, int windows, int doors) {
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
        this.windows = windows;
        this.doors = doors;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWindows() {
        return windows;
    }

    public void startEngine(){
        System.out.println("Car -> Starting engine");
    }

    public void braking(){
        System.out.println("Car -> Car is braking");
    }

    public void accelerate(){
        System.out.println("Car -> Accelerating");
    }

    public static class Ferrari extends Car {

        private boolean isSuperCar;

        private String name;

        public Ferrari(int cylinders, int windows, int doors) {
            super(cylinders, windows, doors);
            this.isSuperCar = true;
            this.name = "Ferrari";
        }

        @Override
        public void startEngine() {
            System.out.println("Here that engine roar!!!");
        }

        @Override
        public void braking() {
            super.braking();
        }

        @Override
        public void accelerate() {
            System.out.println("Accelerate like a rocket!!!!");
        }
    }
}

class Ferrari extends Car {

    private boolean isSuperCar;

    private String name;

    public Ferrari(int cylinders, int windows, int doors) {
        super(cylinders, windows, doors);
        this.isSuperCar = true;
        this.name = "Ferrari";
    }

    @Override
    public void startEngine() {
        System.out.println("Here that engine roar!!!");
    }

    @Override
    public void braking() {
        super.braking();
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate like a rocket!!!!");
    }
}

class Ford extends Car {
    private boolean isSuperCar;

    private String name;

    public Ford(int cylinders, int windows, int doors) {
        super(cylinders, windows, doors);
        this.isSuperCar = false;
        this.name = "Ford";
    }

    @Override
    public void startEngine() {
        System.out.println("Ford -> Starting engine");
    }

    @Override
    public void braking() {
        System.out.println("Ford -> braking");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford -> accelerate");
    }
}

class Main {
    public static void main(String[] args) {

        Ford ford =  new Ford(4,6,5);
        ford.accelerate();

        Ferrari ferrari = new Ferrari(16,4,2);
        ferrari.accelerate();
    }
}