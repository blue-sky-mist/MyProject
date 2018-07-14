 class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

class Cone extends Circle {
    private double length;

    Cone(double radius, double length) {
        super(radius);
        this.length = length;
        System.out.println("Creating a cone object using the circle constructor : ");

    }

    @Override
    public double getArea() {
        System.out.println("This method returns the area of the base of the cone : ");
        return super.getArea() ;

    }

    public double getVolume() {
        System.out.println("This method returns the volume of cone : ");
        return super.getArea()*length;

    }
}

class ConeTest {
    public static void  main(String [] args) {

        Cone c = new Cone(10,50);
        System.out.println("The area of the base of the cone is : " + c.getArea());
        System.out.println("The volume of the base of the cone is : " + c.getVolume());

    }


}