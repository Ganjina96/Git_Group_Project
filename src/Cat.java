public class Cat {

    String name, color, breed;
    int height, weight, age;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    public void gainingWeight(){
        weight += 10;
        System.out.println("Now our cat is " + weight + " pounds");
    }
}
