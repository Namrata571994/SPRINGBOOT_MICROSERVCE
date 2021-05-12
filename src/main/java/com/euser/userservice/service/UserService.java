package com.euser.userservice.service;

import com.euser.userservice.entity.User;
import com.euser.userservice.repository.UserRepo;
import com.euser.userservice.vo.Department;
import com.euser.userservice.vo.ResponceTemplatevo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RestTemplate restTemplate;


    public User saveUser(User user) {
        log.info("Inside saveUser method of UserService");
        return userRepo.save(user);

    }

    public ResponceTemplatevo getdepartmentwithuser(Long userId) {
        User user = userRepo.findUserByuserId(userId);
        ResponceTemplatevo vo = new ResponceTemplatevo();
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
