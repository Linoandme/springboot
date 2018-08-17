package com.lino.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;

    @GetMapping(value = "/girl")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    @GetMapping(value = "/addGirl")
    public Girl addGirl(@RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);

        return girlRepository.save(girl);
    }

    @GetMapping(value = "/updateGirl")
    public Girl updateGirl(@RequestParam("id") int id,@RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }
    @GetMapping(value = "/deleteGirl")
    public void deleteGirl(@RequestParam("id") int id){

      girlRepository.deleteById(id);
    }
    @GetMapping(value = "/findGirlByAge/{age}")
    public List<Girl> findGirlByAge(@PathVariable("age") int age){
       return girlRepository.findByAge(age);
    }

    @GetMapping(value = "/insertTwo")
    public void insertTwo(){
        girlService.insertTwo();
    }
}
