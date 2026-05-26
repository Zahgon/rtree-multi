package com.github.davidmoten.rtreemulti.internal;

import java.util.List;
import com.github.davidmoten.guavamini.Preconditions;
import com.github.davidmoten.rtreemulti.Context;
import com.github.davidmoten.rtreemulti.Entry;
import com.github.davidmoten.rtreemulti.Node;
import com.github.davidmoten.rtreemulti.NonLeaf;
import com.github.davidmoten.rtreemulti.geometry.Geometry;
import com.github.davidmoten.rtreemulti.geometry.Rectangle;

public final class NonLeafDefault<T, S extends Geometry> implements NonLeaf<T, S> {

    private final List<? extends Node<T, S>> children;

    private final Rectangle mbr;

    private final Context<T, S> context;

    public NonLeafDefault(List<? extends Node<T, S>> children, Context<T, S> context) {
        Preconditions.checkArgument(!children.isEmpty());
        this.context = context;
        this.children = children;
        this.mbr = Util.mbr(children);
    }

    @Override
    public Geometry geometry() {
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
    public Node<T, S> child(int i) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Node<T, S>> children() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
