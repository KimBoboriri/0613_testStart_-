package com.github.kingbbode.springbootvuejs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
public class TodoController {

    private static final List<String> USERS = Collections.unmodifiableList(Arrays.asList("kingbbode", "jojoldu"));

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/{user}")
    public String home(@PathVariable String user) {
        if(!USERS.contains(user)) {
            throw new IllegalArgumentException();
        }
        return "home";
    }

    /*
     * 담당자: 김동영
     * 일시 :04:49
     * 추가
     */
    public void DongyoungAdd(){
        System.out.println("동동이가 추가");
    }

    public void bobo(){
         System.out.println("테슷 컨트롤러");
    }
}
