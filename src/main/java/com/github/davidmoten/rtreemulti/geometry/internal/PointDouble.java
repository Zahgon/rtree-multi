package com.github.davidmoten.rtreemulti.geometry.internal;

import java.util.Arrays;
import com.github.davidmoten.rtreemulti.geometry.Geometry;
import com.github.davidmoten.rtreemulti.geometry.Point;
import com.github.davidmoten.rtreemulti.geometry.Rectangle;

public final class PointDouble implements Point {

    private final double[] x;

    private PointDouble(double[] x) {
        this.x = x;
    }

    public static PointDouble create(double[] x) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Rectangle mbr() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public double distance(Rectangle r) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean intersects(Rectangle r) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public double[] mins() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Geometry geometry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public double volume() {
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
    public double intersectionVolume(Rectangle r) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public double surfaceArea() {
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
    public int dimensions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
