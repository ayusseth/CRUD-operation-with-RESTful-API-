package in.sp.RestApi.service;

import in.sp.RestApi.entities.User;
import in.sp.RestApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getALlUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserDetials(int id) {
        return userRepository.findById(id);
    }

    @Override
    public User updateUserDetails(int id, User newuser) {
        User userData = userRepository.findById(id).orElse(null);

        if(userData!=null)
        {
            return userRepository.save(newuser);
        }
        else
        {
            throw new RuntimeException("user not found with id : "+id);
        }
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
