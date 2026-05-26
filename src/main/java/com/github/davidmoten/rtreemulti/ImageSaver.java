package com.github.davidmoten.rtreemulti;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.Callable;
import javax.imageio.ImageIO;

final class ImageSaver {

    private ImageSaver() {
        // prevent instantiation
    }

    static void save(final BufferedImage image, final File file, final String imageFormat) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void run(Callable<Void> callable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
