package com.github.davidmoten.rtreemulti.internal;

import com.github.davidmoten.guavamini.Objects;
import com.github.davidmoten.guavamini.Preconditions;
import com.github.davidmoten.rtreemulti.Entry;
import com.github.davidmoten.rtreemulti.geometry.Geometry;
import com.github.davidmoten.rtreemulti.internal.util.ObjectsHelper;

/**
 * An entry in the R-tree which has a spatial representation.
 *
 * @param <T>
 *            value type
 * @param <S>
 *            geometry type
 */
public final class EntryDefault<T, S extends Geometry> implements Entry<T, S> {

    private final T value;

    private final S geometry;

    /**
     * Constructor.
     *
     * @param value
     *            the value of the entry
     * @param geometry
     *            the geometry of the value
     */
    public EntryDefault(T value, S geometry) {
        Preconditions.checkNotNull(geometry);
        this.value = value;
        this.geometry = geometry;
    }

    /**
     * Factory method.
     *
     * @param <T>
     *            type of value
     * @param <S>
     *            type of geometry
     * @param value
     *            object being given a spatial context
     * @param geometry
     *            geometry associated with the value
     * @return entry wrapping value and associated geometry
     */
    public static <T, S extends Geometry> Entry<T, S> entry(T value, S geometry) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the value wrapped by this {@link EntryDefault}.
     *
     * @return the entry value
     */
    @Override
    public T value() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public S geometry() {
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
}
