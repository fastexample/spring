package net.fastexample.spring.contexthierarchy.web.controller;

import net.fastexample.spring.contexthierarchy.application.service.CommonService;
import net.fastexample.spring.contexthierarchy.web.util.ViewBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController
{
    private final CommonService commonService;
    private final ViewBean viewBean;

    public TestController(final CommonService commonService, final ViewBean viewBean) {
        // Do not forget. If a single constructor is available, the arguments are autowired if they are non-ambiguous.
        this.commonService = commonService;
        this.viewBean = viewBean;
    }

    @GetMapping("/application")
    public String getApplicationValue()
    {
        return commonService.generate();
    }

    @GetMapping("/web")
    public String getWebValue()
    {
        return viewBean.getContent();
    }
}
