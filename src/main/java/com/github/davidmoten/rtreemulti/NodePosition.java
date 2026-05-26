package com.github.davidmoten.rtreemulti;

import com.github.davidmoten.guavamini.Preconditions;
import com.github.davidmoten.rtreemulti.geometry.Geometry;

//Mutable, not thread-safe
final class NodePosition<T, S extends Geometry> {

    private Node<T, S> node;

    private int position;

    NodePosition(Node<T, S> node, int position) {
        Preconditions.checkNotNull(node);
        this.node = node;
        this.position = position;
    }

    Node<T, S> node() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    int position() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean hasRemaining() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void setPosition(int position) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
