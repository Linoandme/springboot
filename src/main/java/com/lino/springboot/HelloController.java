package com.lino.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
   @Autowired
   private GrilProperties grilProperties;

   @Value("${spring.datasource.driver-class-name}")
   private String name;
   @GetMapping(value = "/say")
    public String  say(){
        return "id:"+name ;

    }
}
