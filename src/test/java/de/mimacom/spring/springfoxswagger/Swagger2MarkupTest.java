package de.mimacom.spring.springfoxswagger;

import de.mimacom.spring.sprinfoxswagger.Application;
import io.github.swagger2markup.Swagger2MarkupConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;
import java.nio.file.Paths;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Swagger2MarkupTest {

    @LocalServerPort
    int randomServerPort;

    @Test
    public void convertSwaggerToAsciiDoc() throws Exception {
        Swagger2MarkupConverter.from(
                new URL("http://localhost:" + randomServerPort + "/v2/api-docs")).build()
                .toFolder(Paths.get("target/generated-docs"));
    }
}