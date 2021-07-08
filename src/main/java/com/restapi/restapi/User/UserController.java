package com.restapi.restapi.User;

import lombok.Getter;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("auth/new")
    public JSONObject creatUser(@Valid @RequestBody UserDto userDto) {
        JSONObject res = new JSONObject();
        //
        //

        service.creat(userDto.getEmail(), userDto.getPassword());

        return res;
    }
}
