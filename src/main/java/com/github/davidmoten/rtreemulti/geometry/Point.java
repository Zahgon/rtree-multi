package com.github.davidmoten.rtreemulti.geometry;

import java.util.List;
import com.github.davidmoten.rtreemulti.geometry.internal.PointDouble;

public interface Point extends Rectangle {

    double[] mins();

    default double[] maxes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    default double[] values() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Point create(double... x) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Point create(List<? extends Number> x) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
