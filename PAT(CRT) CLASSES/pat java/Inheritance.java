//Class college
//{
// String name="INSTITUTUTE OF AERONUATICAL ENGINEERING";
// public void iare()
// {
//    System.out.println("Welcome to iare")
// }
//}
class A {
  String name="in class A";
    public void welcome() {
        System.out.println("Welcome to Class A");
    }
}

class B extends A {
    String name="in class B";
    public void home() {
        System.out.println("Welcome Home to Class B");
    }

}
class C extends B{
    public void zoo()
    {
        System.out.println("Welcome to Zoo")
    }
}
public class Inheritance {
    public static void main(String[] args) {
        C ob = new C();
        System.out.println(ob.name);
        ob.welcome();
        ob.home();
    }
}