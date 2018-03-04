package greeting;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Howdy, %s!";
    private int counter = 1;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="Random User") String name) {
        return new Greeting(counter++,
                            String.format(template, name));
    }
}
