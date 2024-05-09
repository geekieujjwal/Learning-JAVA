class Human{
    private int age =11;
    private String name = "Ujjwal";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation{
    public static void main(String a[]){
        Human obj = new Human();
        obj.setAge(20);
        obj.setName("Jaguri Ji");

    System.out.println(obj.getName() + " : " + obj.getAge());
  }
}
