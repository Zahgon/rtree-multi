package com.github.davidmoten.rtreemulti;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public final class Iterables {

    private Iterables() {
        // prevent instantiation
    }

    public static <T> Iterable<T> filter(Iterable<? extends T> iterable, Predicate<? super T> condition) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static final class FilterIterable<T> implements Iterable<T> {

        private final Iterable<? extends T> iterable;

        private final Predicate<? super T> condition;

        FilterIterable(Iterable<? extends T> iterable, Predicate<? super T> condition) {
            this.iterable = iterable;
            this.condition = condition;
        }

        @Override
        public Iterator<T> iterator() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    static final class FilterIterator<T> implements Iterator<T> {

        private Iterator<? extends T> it;

        private final Predicate<? super T> condition;

        private T next;

        FilterIterator(Iterator<? extends T> it, Predicate<? super T> condition) {
            this.it = it;
            this.condition = condition;
        }

        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public T next() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        private void load() {
            if (next == null && it != null) {
                while (it.hasNext()) {
                    T v = it.next();
                    if (condition.test(v)) {
                        next = v;
                        return;
                    }
                }
                it = null;
            }
        }
    }

    public static long size(Iterable<?> iterable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> List<T> toList(Iterable<T> iterable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isEmpty(Iterable<?> entries) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
