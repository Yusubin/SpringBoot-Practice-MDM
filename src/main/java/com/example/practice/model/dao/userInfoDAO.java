package com.example.practice.model.dao;

import com.example.practice.model.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.mybatis.spring.SqlSessionTemplate;

@Component
public class userInfoDAO {
    @Autowired
    SqlSessionTemplate my;
    public UserInfoVO login(UserInfoVO vo) {
        return my.selectOne("user.Login", vo);
    }

}
