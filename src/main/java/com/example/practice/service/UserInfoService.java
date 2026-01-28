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
    private final UserInfoRepository userInfoRepository;

    public UserInfoService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    public boolean login(LoginRequestDto loginRequestDto) {
        Optional<UserInfoEntity> userOpt = userInfoRepository.findByUserId(loginRequestDto.getUserId());

        if (userOpt.isPresent()) {
            UserInfoEntity user = userOpt.get();

            // 비밀번호 단순 비교 (실제론 암호화+검증 필요)
            return user.getUserPassword().equals(loginRequestDto.getUserPassword());
        }

        return false;
    }

}
