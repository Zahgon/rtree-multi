package com.github.davidmoten.rtreemulti.internal;

import java.util.List;
import com.github.davidmoten.rtreemulti.Context;
import com.github.davidmoten.rtreemulti.Entry;
import com.github.davidmoten.rtreemulti.Factory;
import com.github.davidmoten.rtreemulti.Leaf;
import com.github.davidmoten.rtreemulti.Node;
import com.github.davidmoten.rtreemulti.NonLeaf;
import com.github.davidmoten.rtreemulti.geometry.Geometry;

public final class FactoryDefault<T, S extends Geometry> implements Factory<T, S> {

    private static class Holder {

        private static final Factory<Object, Geometry> INSTANCE = new FactoryDefault<Object, Geometry>();
    }

    @SuppressWarnings("unchecked")
    public static <T, S extends Geometry> Factory<T, S> instance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Leaf<T, S> createLeaf(List<Entry<T, S>> entries, Context<T, S> context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public NonLeaf<T, S> createNonLeaf(List<? extends Node<T, S>> children, Context<T, S> context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Entry<T, S> createEntry(T value, S geometry) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
