package AnonymousClasses;

@FunctionalInterface
public interface AbleToSwim {
    void swim();

    static void staticMethod(){
        System.out.println("This is static method inside the functional interface");
    }

    default void swimUnderWater(){
        System.out.println("Swimming under the water is not allowed!");
    }
}
