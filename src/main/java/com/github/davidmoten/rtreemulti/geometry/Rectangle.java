package com.github.davidmoten.rtreemulti.geometry;

import com.github.davidmoten.guavamini.Preconditions;
import com.github.davidmoten.rtreemulti.geometry.internal.RectangleDouble;

/**
 * Represents a rectangle in n dimensions (a hyper-rectangle).
 */
public interface Rectangle extends Geometry, HasGeometry {

    double[] mins();

    double[] maxes();

    double volume();

    double intersectionVolume(Rectangle r);

    double surfaceArea();

    Rectangle add(Rectangle r);

    boolean contains(double... x);

    default double min(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default double max(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Rectangle create(double[] mins, double[] maxes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Rectangle createOrdered(double[] x, double[] y) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // the first half of the values correspond to the minimum values of every
    // ordinate and the next half of the values correspond to the maximum values of
    // every ordinate
    public static Rectangle create(double... values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
