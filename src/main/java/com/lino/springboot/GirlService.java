package com.lino.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {
    @Autowired
    public GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girl = new Girl();
        girl.setCupSize("P");
        girl.setAge(60);
        girlRepository.save(girl);


        Girl girl2 = new Girl();
        girl.setCupSize("Xxxxx");
        girl.setAge(30);
        girlRepository.save(girl2);

    }
}
