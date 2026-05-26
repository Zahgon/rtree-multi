package com.github.davidmoten.rtreemulti.internal;

import static java.util.Optional.of;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import com.github.davidmoten.rtreemulti.Context;
import com.github.davidmoten.rtreemulti.Entry;
import com.github.davidmoten.rtreemulti.Node;
import com.github.davidmoten.rtreemulti.NonLeaf;
import com.github.davidmoten.rtreemulti.geometry.Geometry;
import com.github.davidmoten.rtreemulti.geometry.ListPair;

public final class NonLeafHelper {

    private NonLeafHelper() {
        // prevent instantiation
    }

    public static <T, S extends Geometry> List<Node<T, S>> add(Entry<? extends T, ? extends S> entry, NonLeaf<T, S> node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static <T, S extends Geometry> List<Node<T, S>> makeNonLeaves(ListPair<? extends Node<T, S>> pair, Context<T, S> context) {
        List<Node<T, S>> list = new ArrayList<Node<T, S>>();
        list.add(context.factory().createNonLeaf(pair.group1().list(), context));
        list.add(context.factory().createNonLeaf(pair.group2().list(), context));
        return list;
    }

    public static <T, S extends Geometry> NodeAndEntries<T, S> delete(Entry<? extends T, ? extends S> entry, boolean all, NonLeaf<T, S> node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
