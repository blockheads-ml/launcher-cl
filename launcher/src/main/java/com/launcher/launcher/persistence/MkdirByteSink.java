

package com.launcher.launcher.persistence;

import com.google.common.io.ByteSink;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

class MkdirByteSink extends ByteSink {

    private final ByteSink delegate;
    private final File dir;

    public MkdirByteSink(ByteSink delegate, File dir) {
        this.delegate = delegate;
        this.dir = dir;
    }

    @Override
    public OutputStream openStream() throws IOException {
        dir.mkdirs();
        return delegate.openStream();
    }

}
