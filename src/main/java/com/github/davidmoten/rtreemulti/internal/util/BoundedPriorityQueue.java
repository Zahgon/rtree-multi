package com.github.davidmoten.rtreemulti.internal.util;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.github.davidmoten.guavamini.Preconditions;

public final class BoundedPriorityQueue<T> {

    private final PriorityQueue<T> queue;

    /* backing data structure */
    private final Comparator<? super T> comparator;

    private final int maxSize;

    /**
     * Constructs a {@link BoundedPriorityQueue} with the specified
     * {@code maxSize} and {@code comparator}.
     *
     * @param maxSize
     *            - The maximum size the queue can reach, must be a positive
     *            integer.
     * @param comparator
     *            - The comparator to be used to compare the elements in the
     *            queue, must be non-null.
     */
    public BoundedPriorityQueue(final int maxSize, final Comparator<? super T> comparator) {
        Preconditions.checkArgument(maxSize > 0, "maxSize must be > 0");
        Preconditions.checkNotNull(comparator, "comparator cannot be null");
        this.queue = new PriorityQueue<T>(reverse(comparator));
        this.comparator = comparator;
        this.maxSize = maxSize;
    }

    private static <T> Comparator<T> reverse(final Comparator<T> comparator) {
        return new Comparator<T>() {

            @Override
            public int compare(T o1, T o2) {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        };
    }

    public static <T> BoundedPriorityQueue<T> create(final int maxSize, final Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Adds an element to the queue. If the queue contains {@code maxSize}
     * elements, {@code e} will be compared to the lowest element in the queue
     * using {@code comparator}. If {@code e} is greater than or equal to the
     * lowest element, that element will be removed and {@code e} will be added
     * instead. Otherwise, the queue will not be modified and {@code e} will not
     * be added.
     *
     * @param t
     *            - Element to be added, must be non-null.
     */
    public void add(final T t) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return Returns a view of the queue as a
     *         {@link Collections#unmodifiableList(java.util.List)}
     *         unmodifiableList sorted in reverse order.
     */
    public List<T> asList() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<T> asOrderedList() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
