public class Line {

     Point a;
     Point b;

        public Line(Point a, Point b) {
            this.a = a;
            this.b = b;
        }

        public double calculateLength() {
            double length = Math.sqrt((Math.pow(a.getX()-b.getX(),2))+(Math.pow(a.getY() -b.getY(),2)));
            return length;

        }

    }

