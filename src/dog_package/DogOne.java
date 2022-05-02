package dog_package;

public class DogOne {
    String name;
    String breed;
    int age;
    String color;


//    public DogOne(String name, String breed, int age, String color) {
//        this.name = name;
//        this.breed = breed;
//        this.age = age;
//        this.color = color;
//    }

    public DogOne(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "DogOne{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
