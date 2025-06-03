package testing_with_junit.mocking.web;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrlConnectionFactory implements ConnectionFactory {

    private URL url;

    public HttpUrlConnectionFactory(URL url) {
        this.url = url;
    }

    @Override
    public InputStream getData() throws Exception {
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        return connection.getInputStream();
    }
}
