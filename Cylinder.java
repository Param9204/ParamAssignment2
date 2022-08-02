class Cylinder {

       double radius;
       double height;
        Cylinder() {  //Here we use constructor.
        double r = 1;
            double h = 1;
        }
        Cylinder(double r) {  //Here we use constructor.
             radius=r;
        }
        Cylinder(double r, double h) {  //Here we use constructor.
            radius=r;
            height=h;
        }
        double getArea() {
            return ( 2*Math.PI * radius * height + 2 * Math.PI * radius * radius);
        }  //Here we define formula
    }

