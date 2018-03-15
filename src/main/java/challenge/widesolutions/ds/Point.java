package challenge.widesolutions.ds;

public class Point {
    public int x, y;

    public static Point parse(String values) {
        Point result = new Point();
        String[] strings = values.split(" ");
        result.x = Integer.parseInt(strings[0]);
        result.y = Integer.parseInt(strings[1]);
        return result;
    }

    public static Point parse(String x, String y) {
        Point result = new Point();
        result.x = Integer.parseInt(x);
        result.y = Integer.parseInt(y);
        return result;
    }
}
