

package com.launcher.launcher.persistence;

import com.google.common.io.ByteSource;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import java.io.IOException;
import java.io.InputStream;

class ScramblingSourceFilter extends ByteSource {

    private final ByteSource delegate;
    private final String key;

    public ScramblingSourceFilter(ByteSource delegate, String key) {
        this.delegate = delegate;
        this.key = key;
    }

    @Override
    public InputStream openStream() throws IOException {
        Cipher cipher = null;
        try {
            cipher = ScramblingSinkFilter.getCipher(Cipher.DECRYPT_MODE, key);
        } catch (Throwable e) {
            throw new IOException("Failed to create cipher", e);
        }
        return new CipherInputStream(delegate.openStream(), cipher);
    }

}
