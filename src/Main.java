public class Main {
    public static void main(String[] args) {
        Car car1 = new Sedan();
        car1.gas();
        car1.setColor("Black");
        System.out.println(car1.getColor());
        Car car2 = new SportCar();
        car2.gas();
        car2.setColor("Red");
        System.out.println(car2.getColor());
        car1.brake();
        car2.brake();

        Person p1 = new Person("Alikhan", 17);
        p1.getAge();
        p1.getName();
    }
}
