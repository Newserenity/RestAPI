package com.restapi.restapi.User;

import lombok.RequiredArgsConstructor;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public JSONObject creat(String email, String password) {
        JSONObject res = new JSONObject();
        UserEntity user = UserEntity.builder()
                .email(email)
                .password(password)
                .joinDate(new Date())
                .softDelete(new String("N"))
                .baned(new String("N"))
                .build();

        userRepository.save(user);

        return res;
    }
}
