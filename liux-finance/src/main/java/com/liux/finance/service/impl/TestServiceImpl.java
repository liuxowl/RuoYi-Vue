package com.liux.finance.service.impl;

import com.liux.finance.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String helloTest() {
        return "hello 1206";
    }
}
