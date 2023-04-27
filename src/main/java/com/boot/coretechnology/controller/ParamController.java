package com.boot.coretechnology.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wang
 * @create 2022-2022-02-14:30
 */
@RestController
public class ParamController {

    @RequestMapping(value="/car/{id}/owner/{name}")
    public Map<String,Object> getCar(@PathVariable("id")Integer id, @PathVariable("name")String name,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("Accept-Language")String acceptLanguage,
//                                     @RequestParam("msg")String msg,
//                                     @RequestParam("nima")String nima,
//                                     @RequestParam("intersts") List<String> intersts,
                                     @CookieValue("cookieId")String cookid,
                                     @CookieValue("cookieId") Cookie cookie,
                                     @CookieValue("JSESSIONID")String sessionId){

        Map<String,Object> map = new HashMap<>();

        map.put("id",id);
        map.put("name",name);
        map.put("pv",pv);

        map.put("accept-languages",acceptLanguage);

//        map.put("msg",msg);
//        map.put("nima",nima);
//        map.put("intersts",intersts);

        map.put("cookid",cookid);
        map.put("cookid",cookie);
        map.put("sessionId",sessionId);
        return map;
    }

    @GetMapping("/testRequestAttribute")
    public Map<String,Object> attributeTest(@RequestAttribute("msg")String msg,
                                            @RequestAttribute("nimade")String nimade,
                                            Model model,HttpServletRequest request){
        Map<String,Object>  map = new HashMap<>();

        String mapnimade = (String) request.getAttribute("mapnima");
        String modelnimade = (String) request.getAttribute("modelnima");

        String laozi = (String) request.getAttribute("laozi");

        map.put("msg",msg);
        map.put("nimade",nimade);
        map.put("mapnimade",mapnimade);
        map.put("modelnimade",modelnimade);
        map.put("laozi",laozi);

        return map;

    }




}
