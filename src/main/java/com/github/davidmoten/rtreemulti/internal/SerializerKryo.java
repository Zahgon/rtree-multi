package com.github.davidmoten.rtreemulti.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Optional;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.github.davidmoten.rtreemulti.Context;
import com.github.davidmoten.rtreemulti.Factory;
import com.github.davidmoten.rtreemulti.Node;
import com.github.davidmoten.rtreemulti.RTree;
import com.github.davidmoten.rtreemulti.Selector;
import com.github.davidmoten.rtreemulti.SelectorMinimalVolumeIncrease;
import com.github.davidmoten.rtreemulti.SelectorRStar;
import com.github.davidmoten.rtreemulti.Splitter;
import com.github.davidmoten.rtreemulti.SplitterQuadratic;
import com.github.davidmoten.rtreemulti.SplitterRStar;
import com.github.davidmoten.rtreemulti.geometry.Geometry;

public class SerializerKryo<T, S extends Geometry> implements com.github.davidmoten.rtreemulti.internal.Serializer<T, S> {

    private static final int VERSION = 1;

    @Override
    public void write(RTree<T, S> tree, OutputStream out) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public RTree<T, S> read(InputStream in) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static Kryo createKryo() {
        Kryo k = new Kryo();
        k.register(RTree.class, new Serializer<RTree<Object, Geometry>>() {

            @Override
            public RTree<Object, Geometry> read(Kryo k, Input input, Class<? extends RTree<Object, Geometry>> cls) {
                throw new UnsupportedOperationException("STUB: not implemented");
            }

            @Override
            public void write(Kryo k, Output output, RTree<Object, Geometry> tree) {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        });
        return k;
    }
}
