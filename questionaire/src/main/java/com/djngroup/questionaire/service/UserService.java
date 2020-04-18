package com.djngroup.questionaire.service;

import java.util.Optional;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.djngroup.questionaire.entity.User;
import com.djngroup.questionaire.UserRepository;

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;


}
