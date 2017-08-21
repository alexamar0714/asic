package no.difi.asic.api;

import no.difi.asic.builder.Properties;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author erlend
 */
public interface EncryptionFilter {

    String filename(String filename);

    OutputStream createFilter(OutputStream outputStream, Properties properties) throws IOException;

}
