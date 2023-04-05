package com.backend.seckill.controller;

import com.backend.seckill.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @RequestMapping("/toList")
    public String toList(HttpSession session, Model model,@CookieValue("userTicket") String ticket){
        if(StringUtils.isEmpty(ticket))
            return "login";
        User user = (User) session.getAttribute(ticket);
        if(null == user)
            return "login";
        model.addAttribute("user",user);
        return "goodsList";
    }
}
