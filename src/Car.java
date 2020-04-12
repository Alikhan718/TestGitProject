public interface Car {

    void setColor(String color);
    String getColor();

    default void gas() {
        System.out.println("Gas!!!");
    }

    default void brake() {
        System.out.println("BREAK!!!");
    }

}
