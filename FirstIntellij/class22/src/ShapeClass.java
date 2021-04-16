public class ShapeClass {
            int radius;
        ShapeClass(int radius) {
            this.radius = radius;
        }
    }
    class Circle extends ShapeClass {
        double area;
        Circle(int radius) {
            super(radius);
        }
        void area() {
            area = (radius * 2) * 3.14;
            System.out.println(area);
        }
        public static void main(String[] args) {
            Circle c = new Circle(10);
            c.area();
        }
    }

