package sh.swan.springboot3blog.subT;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubController {
    @GetMapping("/sub")
    public void subMain() {
        System.out.println("들어옴???????");
    }
}
