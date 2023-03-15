package service.impl;

import model.User;
import repository.IUserRepository;
import repository.impl.UserRepository;
import service.IUserService;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {
    IUserRepository userRepository=new UserRepository();

    @Override
    public boolean add(User user) {
    return userRepository.add(user);
    }

    @Override
    public List<User> findByCountry(String str) {
        return userRepository.findByCountry(str);
    }


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean remove(int id) {
        return userRepository.remove(id);
    }

    @Override
    public boolean update(int id,User user) {
        return userRepository.update(id,user);
    }


}
