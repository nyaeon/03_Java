package HOMEWORK2_week.chep10.api.practicequestion;

public class App {
    public static void main(String[] args) {

        Car myCar = new Car("Sonata", "검정", 2000);
        Car yourCar = new Car("Sonata", "검정", 2500);

        if (myCar.equals(yourCar)) {
        System.out.println(myCar.equals(yourCar));
            System.out.println("true");// true
        }
        else if (myCar.hashCode() ==yourCar.hashCode()){                                          // true
            System.out.println(myCar.hashCode() == yourCar.hashCode());
            System.out.println("true");// true
        }
            Car hisCar = new Car("Sonata", "화이트", 2000);
        if (myCar.equals(hisCar)) {
            System.out.println(myCar.equals(hisCar));}
        else {// false
            System.out.println(myCar.hashCode() == hisCar.hashCode()); // false
            System.out.println("false");// true
        };
   //    if (myCar.hashCode() == hisCar.hashCode()) {
   //        System.out.println(myCar.hashCode() == hisCar.hashCode());
   //    }else {
   //        System.out.println(myCar.hashCode() == hisCar.hashCode());
   //    }


       }

    }

