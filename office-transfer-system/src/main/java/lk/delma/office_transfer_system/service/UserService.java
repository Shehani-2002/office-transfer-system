package lk.delma.office_transfer_system.service;


import lk.delma.office_transfer_system.entity.User;
import lk.delma.office_transfer_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User updateUser(Long id, User updatedUser) {
        User user = getUserById(id);

        user.setUserName(updatedUser.getUserName());
        user.setPassword(updatedUser.getPassword());
        user.setRole(updatedUser.getRole());
        user.setEmployee(updatedUser.getEmployee());

        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}