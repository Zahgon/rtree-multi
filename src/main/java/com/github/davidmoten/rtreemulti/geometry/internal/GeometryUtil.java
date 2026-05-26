package com.github.davidmoten.rtreemulti.geometry.internal;

import com.github.davidmoten.rtreemulti.geometry.Rectangle;

public final class GeometryUtil {

    private GeometryUtil() {
        // prevent instantiation
    }

    public static double max(double a, double b) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static double distance(double[] x, Rectangle r) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static double distance(double[] x, double[] a, double[] b) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // distance between two rectangles
    public static double distance(double[] x, double[] y, double[] a, double[] b) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean intersects(double[] mins, double[] maxes, double[] minsOther, double[] maxesOther) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //    public static boolean lineIntersects(double x1, double y1, double x2, double y2, Circle circle) {
    //
    //        // using Vector Projection
    //        // https://en.wikipedia.org/wiki/Vector_projection
    //        Vector c = Vector.create(circle.x(), circle.y());
    //        Vector a = Vector.create(x1, y1);
    //        Vector cMinusA = c.minus(a);
    //        double radiusSquared = circle.radius() * circle.radius();
    //        if (x1 == x2 && y1 == y2) {
    //            return cMinusA.modulusSquared() <= radiusSquared;
    //        } else {
    //            Vector b = Vector.create(x2, y2);
    //            Vector bMinusA = b.minus(a);
    //            double bMinusAModulus = bMinusA.modulus();
    //            double lambda = cMinusA.dot(bMinusA) / bMinusAModulus;
    //            // if projection is on the segment
    //            if (lambda >= 0 && lambda <= bMinusAModulus) {
    //                Vector dMinusA = bMinusA.times(lambda / bMinusAModulus);
    //                // calculate distance to line from c using pythagoras' theorem
    //                return cMinusA.modulusSquared() - dMinusA.modulusSquared() <= radiusSquared;
    //            } else {
    //                // return true if and only if an endpoint is within radius of
    //                // centre
    //                return cMinusA.modulusSquared() <= radiusSquared
    //                        || c.minus(b).modulusSquared() <= radiusSquared;
    //            }
    //        }
    //
    //    }
    public static double[] min(double[] a, double[] b) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static double[] max(double[] a, double[] b) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
