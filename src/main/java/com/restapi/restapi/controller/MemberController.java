package com.restapi.restapi.controller;

import com.restapi.restapi.modle.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("/member")
@RestController
public class MemberController {

    @GetMapping("/test")
    public Member memberTest() {
        return new Member(1, "newcephei", "Newcephei@icloud.com", "password", new Date());
    }
}
