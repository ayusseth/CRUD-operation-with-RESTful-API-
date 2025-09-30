package in.sp.RestApi.service;

import in.sp.RestApi.entities.User;
import in.sp.RestApi.exception.UserNotFoundException;
import in.sp.RestApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service        //it tells the spring that this class is ready to create its bean, and it Allows dependency injection with @Autowired in other classes.
public class UserServiceImpl implements UserService {
//    @Autowired
//    private UserRepository userRepository;
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getALlUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserDetials(int id) {
        return userRepository.findById(id).orElseThrow(()->new UserNotFoundException(id+" is not found"));
    }

    @Override
    public User updateUserDetails(int id, User user) {
        User userData = userRepository.findById(id).orElseThrow(()->new UserNotFoundException(id+" is not found for update"));
        if(user.getName()!=null){
            userData.setName(user.getName());
        }
        if(user.getAge()!=0){
            userData.setAge(user.getAge());
        }
        if(user.getMail()!=null){
            userData.setMail(user.getMail());
        }
        return userRepository.save(userData);

    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
