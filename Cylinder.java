class Cylinder {

       double radius;
       double height;
        Cylinder() {
        double r = 1;
            double h = 1;
        }
        Cylinder(double r) {
             radius=r;
        }
        Cylinder(double r, double h) {
            radius=r;
            height=h;
        }
        double getArea() {
            return ( 2*Math.PI * radius * height + 2 * Math.PI * radius * radius);
        }
    }

