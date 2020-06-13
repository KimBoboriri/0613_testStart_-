package com.github.kingbbode.springbootvuejs.controller;

import com.github.kingbbode.springbootvuejs.dto.TestDto;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
import java.util.ArrayList;

public class DomiNewController {
    //도미가 변경했다
    //domi는 지웠다
    //요기 작업하세요 김도미씨앗

    /*

    * 담당자 : 김동영
    * 일시:05:16
    * 앞단 바인딩작업 추가
    */
    public String TestDomiNew(){
        int binding = 0;
        return "";
    }

    //잘하셨어요 돔도미 씨앗 확인햇습니다.

    @GetMapping("/testone")
    public TestDto testMet(){
        String name = "김도미";
        String age = "10";
        TestDto dto = new TestDto();
        dto.setName(name);
        dto.setAge(age);
        return dto;
    }

}
