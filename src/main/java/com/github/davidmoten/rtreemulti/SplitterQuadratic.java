package com.github.davidmoten.rtreemulti;

import static java.util.Optional.empty;
import static java.util.Optional.of;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.github.davidmoten.guavamini.Lists;
import com.github.davidmoten.guavamini.Preconditions;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;
import com.github.davidmoten.rtreemulti.geometry.HasGeometry;
import com.github.davidmoten.rtreemulti.geometry.ListPair;
import com.github.davidmoten.rtreemulti.geometry.Rectangle;
import com.github.davidmoten.rtreemulti.internal.Util;
import com.github.davidmoten.rtreemulti.internal.util.Pair;

public final class SplitterQuadratic implements Splitter {

    public static final SplitterQuadratic INSTANCE = new SplitterQuadratic();

    private SplitterQuadratic() {
        // prevent instantiation
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends HasGeometry> ListPair<T> split(List<T> items, int minSize) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private <T extends HasGeometry> void assignRemaining(final List<T> group1, final List<T> group2, final List<T> remaining, final int minGroupSize) {
        final Rectangle mbr1 = Util.mbr(group1);
        final Rectangle mbr2 = Util.mbr(group2);
        final T item1 = getBestCandidateForGroup(remaining, group1, mbr1);
        final T item2 = getBestCandidateForGroup(remaining, group2, mbr2);
        final boolean volume1LessThanVolume2 = item1.geometry().mbr().add(mbr1).volume() <= item2.geometry().mbr().add(mbr2).volume();
        if (volume1LessThanVolume2 && (group2.size() + remaining.size() - 1 >= minGroupSize) || !volume1LessThanVolume2 && (group1.size() + remaining.size() == minGroupSize)) {
            group1.add(item1);
            remaining.remove(item1);
        } else {
            group2.add(item2);
            remaining.remove(item2);
        }
    }

    @VisibleForTesting
    static <T extends HasGeometry> T getBestCandidateForGroup(List<T> list, List<T> group, Rectangle groupMbr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @VisibleForTesting
    static <T extends HasGeometry> Pair<T> worstCombination(List<T> items) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
