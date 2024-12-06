package com.ruoyi.web.controller.finance;

import com.liux.finance.service.TestService;
import com.ruoyi.common.core.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finance/test")
public class FinTestController extends BaseController {

    @Autowired
    private TestService testService;

    @GetMapping("/list")
    public String list() {
        return testService.helloTest();
    }
}
