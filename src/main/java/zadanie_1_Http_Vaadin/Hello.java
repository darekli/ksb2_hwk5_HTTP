package zadanie_1_Http_Vaadin;

import org.springframework.web.bind.annotation.GetMapping;

public class Hello {

    @GetMapping("/hello")
    public String get(){
        return "hello";
    }
}
