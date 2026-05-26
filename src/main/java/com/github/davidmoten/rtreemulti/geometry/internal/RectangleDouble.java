package com.github.davidmoten.rtreemulti.geometry.internal;

import java.util.Arrays;
import com.github.davidmoten.guavamini.Preconditions;
import com.github.davidmoten.rtreemulti.geometry.Geometry;
import com.github.davidmoten.rtreemulti.geometry.Rectangle;
import com.github.davidmoten.rtreemulti.internal.util.ObjectsHelper;

public final class RectangleDouble implements Rectangle {

    private final double[] mins;

    private final double[] maxes;

    private RectangleDouble(double[] mins, double[] maxes) {
        Preconditions.checkArgument(mins.length == maxes.length);
        for (int i = 0; i < mins.length; i++) {
            Preconditions.checkArgument(maxes[i] >= mins[i]);
        }
        this.mins = mins;
        this.maxes = maxes;
    }

    public static RectangleDouble create(double[] mins, double[] maxes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Rectangle add(Rectangle r) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean contains(double... p) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean intersects(Rectangle r) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public double distance(Rectangle r) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Rectangle mbr() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public double intersectionVolume(Rectangle r) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Geometry geometry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static double max(double a, double b) {
        if (a < b)
            return b;
        else
            return a;
    }

    private static double min(double a, double b) {
        if (a < b)
            return a;
        else
            return b;
    }

    @Override
    public double surfaceArea() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public double[] mins() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public double[] maxes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int dimensions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
