class Mobile {
//    These are instance variables
    String brand;
    int price;
//    This is a static variable
    static String name;

    static {
        name = "AI Based Phones";
        System.out.println("Inside the Static Block");
    }

//    This is a constructor
    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("Inside the constructor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

//
}

public class Static {

    public static void main(String a[]) throws ClassNotFoundException {

        Class.forName("Mobile");

//       Mobile obj1 = new Mobile();
//       obj1.brand = "Apple";
//       obj1.price = 1500;
//       Mobile.name = "Smartphone";
//
//       Mobile obj2 = new Mobile();

//        Mobile obj2 = new Mobile();
//        obj2.brand = "Samsung";
//        obj2.price = 1700;
//        Mobile.name = "Smartphone";
//
//        Mobile.name = "Phones";

//       obj1.show();
//       obj2.show();

//       Mobile.show1(obj1);
    }
}