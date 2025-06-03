package testing_with_junit.mocking.web;

import java.io.InputStream;

/**
 * A connection factory interface. Different connection
 * factories that we have, must implement this interface.
 */
public interface ConnectionFactory {
    /**
     * Read the data from the connection.
     *
     * @return
     * @throws Exception
     */
    InputStream getData() throws Exception;
}