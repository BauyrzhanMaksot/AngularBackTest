package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bauka on 22-Oct-19
 */
@RestController
public class Controller {

    @GetMapping("nextCounter/{counter}")
    public String nextCounter(@PathVariable String counter) throws Exception {
        Integer count = Integer.valueOf(counter);
        if (count == 0) return "1";
        return String.valueOf(count*2);
    }
}
