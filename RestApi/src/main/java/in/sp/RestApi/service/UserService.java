package in.sp.RestApi.service;

import in.sp.RestApi.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User createUser(User user);

    public List<User> getALlUser();

    public Optional<User> getUserDetials(int id);

    public User updateUserDetails(int id, User user);

    public void deleteUser(int id);
}
