package com.boot.coretechnology.controller;

import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author wang
 * @create 2022-2022-01-15:45
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/userHome")
    public String user(){
        return "user";
    }

    @RequestMapping("/paramTest")
    public String param(){
        return "param";
    }

    @RequestMapping("/getRequestAttribute")
    public String getRequestAttribute(HttpServletRequest request){

        request.setAttribute("msg","error");
        request.setAttribute("nima","尼玛的");

        return "forward:/car/3/owner/wanglaowu";
    }

    @RequestMapping("/getCookie")
    public String getCookie(HttpServletResponse response){

        Cookie cookie = new Cookie("cookieId","wangwu");

        response.addCookie(cookie);

        return "forward:/car/4/owner/nimade";
    }

    @RequestMapping("/requestAttribute")
    public String requestAttribute(HttpServletRequest request){

        request.setAttribute("msg","this is error!");
        request.setAttribute("nimade","尼玛的");

        System.out.println("wahha");
        return "forward:/attribute";
    }

    @RequestMapping("/attribute")
    public String attribute(HttpServletRequest request, Map<String,String> map, Model model){
        request.setAttribute("laozi","laozinima");
        model.addAttribute("modelnima","modelnima");
        map.put("mapnima","mapnima");
        System.out.println("nimade");
        return "forward:/testRequestAttribute";
    }

    @RequestMapping("/file")
    @ResponseBody
    public FileSystemResource fileSystemResource(){
        return null;
    }
}
