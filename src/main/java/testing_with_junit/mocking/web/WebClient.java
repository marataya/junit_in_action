package testing_with_junit.mocking.web;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebClient {

    public String getContent(ConnectionFactory connectionFactory) {
        String workingContent;

        StringBuffer content = new StringBuffer();

        try (InputStream is = connectionFactory.getData()) {
            int count;

            while (-1 != (count = is.read())) {
                content.append(new String(Character.toChars(count)));
            }
            workingContent = content.toString();
        } catch (Exception e) {
            return null;
        }
        return workingContent;
    }

    /**
     * Creates an HTTP connection.
     *
     * @param url
     * @return
     * @throws IOException
     */
    protected HttpURLConnection createHttpURLConnection(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }
}
