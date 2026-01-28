package com.example.practice.service;

import com.example.practice.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.practice.dto.LoginRequestDto;
import com.example.practice.entity.UserInfoEntity;
import com.example.practice.repository.UserInfoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserInfoService {

    private final UserInfoRepository repo;

    public UserInfoService(UserInfoRepository repo) {
        this.repo = repo;
    }

    public LoginRequestDto login(LoginRequestDto dto) {
        UserInfoEntity user = repo.findByUserId(dto.getUserId())
                .orElse(null);

        if (user == null) {
            return null;
        }


        if (!user.getUserPassword().equals(dto.getUserPassword())) {
            return null;
        }

        LoginRequestDto sessionDto = new LoginRequestDto();
        sessionDto.setUserId(user.getUserId());
        sessionDto.setUserPassword(null);

        return sessionDto;
    }
}
