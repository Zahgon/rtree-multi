package com.github.davidmoten.rtreemulti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.github.davidmoten.guavamini.Preconditions;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;
import com.github.davidmoten.rtreemulti.geometry.HasGeometry;
import com.github.davidmoten.rtreemulti.geometry.ListPair;

public final class SplitterRStar implements Splitter {

    public static final SplitterRStar INSTANCE = new SplitterRStar();

    private final Comparator<ListPair<?>> comparator;

    private SplitterRStar() {
        this.comparator = new Comparator<ListPair<?>>() {

            @Override
            public int compare(ListPair<?> p1, ListPair<?> p2) {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        };
    }

    private static final boolean[] BOOLEANS = new boolean[] { false, true };

    @Override
    public <T extends HasGeometry> ListPair<T> split(List<T> items, int minSize) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static Comparator<HasGeometry> comparator(int dimension, boolean upper) {
        if (upper) {
            return (a, b) -> Double.compare(a.geometry().mbr().max(dimension), b.geometry().mbr().max(dimension));
        } else {
            return (a, b) -> Double.compare(a.geometry().mbr().min(dimension), b.geometry().mbr().min(dimension));
        }
    }

    private static <T extends HasGeometry> double marginValueSum(List<ListPair<T>> list) {
        double sum = 0;
        for (ListPair<T> p : list) sum += p.marginSum();
        return sum;
    }

    @VisibleForTesting
    static <T extends HasGeometry> List<ListPair<T>> getPairs(int minSize, List<T> list) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static double overlap(ListPair<? extends HasGeometry> pair) {
        return pair.group1().geometry().mbr().intersectionVolume(pair.group2().geometry().mbr());
    }
}
