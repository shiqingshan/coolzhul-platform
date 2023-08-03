package com.coolzhul.admin.test.service.impl;

import com.coolzhul.admin.test.domain.Test;
import com.coolzhul.admin.test.persistence.mysql.TestMapper;
import com.coolzhul.admin.test.service.ITestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@AllArgsConstructor
@Service
public class TestService implements ITestService {
    private final TestMapper testMapper;

    @Override
    public void insertTest() {
        Test test = new Test();
        test.setCreateBy("AA");
        test.setName("uz");
        test.setCreateDate(new Date());
        Test save = testMapper.save(test);
        System.out.println(save.getId());
    }
}
