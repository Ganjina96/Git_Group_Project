public class Setup {
    // setting up project for everyone
    //sasha started making some changes
    //sasha continue making some changes
    // Victoria started making some changes
    //Victoria continue making some changes
    // Alexey made some updated
    // Alexey made another update
    //Victoria continue making some changes
    // Alexey added another line of meaningful code

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Another cat");
        System.out.println("Bye World");
        System.out.println("Bye");

        Cat cat1 = new Cat();
        cat1.name = "Mashka";
        cat1.color = "Gray";
        cat1.breed = "Street";
        cat1.height = 20;
        cat1.weight = 3;
        cat1.age = 5;

        System.out.println(cat1);

        cat1.gainingWeight();
    }
}
