public class P2_1Main {
    public static void main(String[] args) {
        Cylinder sc = new Cylinder();
        Cylinder sc1 = new Cylinder(5);
        Cylinder sc2 = new Cylinder(5, 6);
        System.out.println("Area of cylinder1 is " +
               sc.getArea());
        System.out.println("Area of cylinder2 is " +
                sc1.getArea());
        System.out.println("Area of cylinder3 is " +
                sc2.getArea());
       // P2_1Main obj = new P2_1Main();
    }
}
