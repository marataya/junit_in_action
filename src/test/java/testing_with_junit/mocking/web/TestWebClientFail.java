package testing_with_junit.mocking.web;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestWebClientFail {

    @Test
    public void testGetContentOk() throws IOException {
        MockConnectionFactory mockConnectionFactory = new MockConnectionFactory();

        MockInputStream mockInputStream = new MockInputStream();
        mockInputStream.setBuffer("It works");

        mockConnectionFactory.setData(mockInputStream);

        WebClient webClient = new WebClient();
        String workingContent = webClient.getContent(mockConnectionFactory);
        assertEquals("It works", workingContent);
        mockInputStream.verify();
    }
}