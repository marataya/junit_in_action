package testing_with_junit.mocking.web;

import java.io.InputStream;

public class MockConnectionFactory implements ConnectionFactory {
    /**
     * The input stream for the connection.
     */
    private InputStream inputStream;

    /**
     * Set the input stream.
     *
     * @param stream
     */
    public void setData(InputStream stream) {
        this.inputStream = stream;
    }

    /**
     * Get the input stream.
     *
     * @throws Exception
     */
    @Override
    public InputStream getData() //throws Exception
    {
        return inputStream;
    }
}
