package com.example.case_study.service.my_user_detail_service;


import com.example.case_study.model.my_user_detail.MyUserDetail;
import com.example.case_study.model.user_role.User;
import com.example.case_study.repository.user.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private IUserRepository iUserRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=iUserRepository.findByUsername(username);

        if (user==null){
            throw new UsernameNotFoundException("User name : " + username +"not found");
        }
        return new MyUserDetail(user);
    }
}
