package testing_with_junit.mocking.web;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestWebClient {

    @Test
    public void testGetContentOk() throws IOException {
        MockConnectionFactory mockConnectionFactory = new MockConnectionFactory();

        mockConnectionFactory.setData(new ByteArrayInputStream("It works".getBytes()));

        WebClient webClient = new WebClient();
        String workingContent = webClient.getContent(mockConnectionFactory);
        assertEquals("It works", workingContent);
    }
}