import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Point {
    public final long x, y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public static Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
        if (a1 * b2 - a2 * b1 == 0) {
            // 두 직선이 평행하거나 겹치는 경우
            return null;
        }

        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);
        if (x == (long) x && y == (long) y) {
            return new Point((long) x, (long) y);
        } else {
            return null;
        }
    }

    public static Point getMinimumPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point p : points) {
            if (p.x < x) x = p.x;
            if (p.y < y) y = p.y;
        }

        return new Point(x, y);
    }

    public static Point getMaximumPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point p : points) {
            if (p.x > x) x = p.x;
            if (p.y > y) y = p.y;
        }
        return new Point(x, y);
    }
}

class Solution {
    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point intersection = Point.intersection(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);
                if (intersection != null) {
                    points.add(intersection);
                }
            }
        }

        Point minimum = Point.getMinimumPoint(points);
        Point maximum = Point.getMaximumPoint(points);

        int width = (int) (maximum.x - minimum.x + 1);
        int height = (int) (maximum.y - minimum.y + 1);

        char[][] arr = new char[height][width];
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }

        for (Point p : points) {
            int x = (int) (p.x - minimum.x);
            int y = (int) (maximum.y - p.y);
            arr[y][x] = '*';
        }

        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }
        return result;
    }
}
