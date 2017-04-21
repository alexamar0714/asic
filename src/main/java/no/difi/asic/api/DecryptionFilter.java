package no.difi.asic.api;

import no.difi.asic.lang.AsicExcepion;

import java.io.IOException;
import java.io.InputStream;
import java.security.PrivateKey;

/**
 * @author erlend
 */
public interface DecryptionFilter {

    InputStream createFilter(InputStream inputStream, Enum<?> algorithm, PrivateKey privateKey)
            throws IOException, AsicExcepion;

}
