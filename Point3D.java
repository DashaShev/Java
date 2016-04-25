/*
 * 
 */
import java.lang.Math;

public class Point3D {
    private int x;
    private int y;
    private int z;
    private int dist;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        double sq = x*x + y*y + z*z;
        this.dist = (int)Math.round(Math.sqrt(sq));
    }

    public String toString()
    {
        return String.format("Point3D(%d, %d, %d): d=%d", x, y, z, dist);
    }

    public int distance() {
        return this.dist;
    }
}

