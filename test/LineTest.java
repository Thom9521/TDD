import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LineTest {

    @Test
    void testPointX(){
        Point point = new Point();

        int pointX = 0;

        point.setX(4);

        pointX = point.getX();

        assertEquals(4, pointX);
    }

    @Test
    void testLength1() {
        Point a = new Point();
        a.setX(3);
        a.setY(0);

        Point b = new Point();
        b.setX(0);
        b.setY(4);

        Line line = new Line(a,b);

        double length = line.calculateLength();
        assertEquals(5.0,length);
    }
}
