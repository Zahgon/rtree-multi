package com.github.davidmoten.rtreemulti.internal;

import java.util.List;
import com.github.davidmoten.rtreemulti.Context;
import com.github.davidmoten.rtreemulti.Entry;
import com.github.davidmoten.rtreemulti.Leaf;
import com.github.davidmoten.rtreemulti.Node;
import com.github.davidmoten.rtreemulti.geometry.Geometry;
import com.github.davidmoten.rtreemulti.geometry.Rectangle;

public final class LeafDefault<T, S extends Geometry> implements Leaf<T, S> {

    private final List<Entry<T, S>> entries;

    private final Rectangle mbr;

    private final Context<T, S> context;

    public LeafDefault(List<Entry<T, S>> entries, Context<T, S> context) {
        this.entries = entries;
        this.context = context;
        this.mbr = Util.mbr(entries);
    }

    @Override
    public Geometry geometry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<Entry<T, S>> entries() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int count() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<Node<T, S>> add(Entry<? extends T, ? extends S> entry) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public NodeAndEntries<T, S> delete(Entry<? extends T, ? extends S> entry, boolean all) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Context<T, S> context() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Entry<T, S> entry(int i) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
