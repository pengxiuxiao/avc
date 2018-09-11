package com.supadata.controller;

import com.supadata.pojo.TeamBuy;
import com.supadata.service.TeamBuyService;
import com.supadata.utils.MsgJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: TestController
 * @Description:
 * @Auther: pxx
 * @Date: 2018/8/21 16:37
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TeamBuyService teamBuyService;

    @RequestMapping("/test")
    public MsgJson Tetst(HttpServletRequest request) {
        String name = request.getParameter("name");
        TeamBuy tb = new TeamBuy();
        tb.setPayNumber("1");
        tb.setTbUrl("rwerqrqwe");
        int res = teamBuyService.insertSelective(tb);
        System.out.println("2222222");
        System.out.println("2222222");
        return new MsgJson(res,tb);
    }
}
