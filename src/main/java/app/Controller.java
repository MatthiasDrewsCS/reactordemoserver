package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class Controller {

    @GetMapping
    public UUID get() throws InterruptedException {
        Thread.sleep(1000);
        return UUID.randomUUID();
    }
}
