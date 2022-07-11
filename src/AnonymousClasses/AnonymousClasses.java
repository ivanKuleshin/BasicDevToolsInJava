package AnonymousClasses;

public class AnonymousClasses {
    public static void main(String[] arg) {
//        Using anonymous classes
        Animal animal1 = new Animal("cat") {
            //            We are able to create static final variables, NOT just static
            static final String meal = "fish";

            @Override
            protected void eat() {
                System.out.printf("The %s is eating %s\n", name, meal);
            }
        };
        Animal animal2 = new Animal("dog");

        animal1.eat();
        animal2.eat();

//        Using lambda and functional interface
        AbleToSwim ableToSwim = () -> System.out.println("The dog is swimming");
//        Using functional interface with anonymous class
        AbleToSwim ableToSwim1 = new AbleToSwim() {
            @Override
            public void swim() {
                System.out.println("The cat is swimming");
            }

            @Override
            public void swimUnderWater() {
                System.out.println("Cat can swim under the water");
            }
        };

        ableToSwim.swim();
        AbleToSwim.staticMethod();
        ableToSwim.swimUnderWater();
        ableToSwim1.swim();
        ableToSwim1.swimUnderWater();
    }

    public static class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }

        protected void eat() {
            System.out.printf("The %s is eating\n", name);
        }
    }
}
