package in.sp.RestApi.controller;

import in.sp.RestApi.entities.User;
import in.sp.RestApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Mycontroller {
//    @Autowired
//    private UserService userService;
    private final UserService userService;

    public Mycontroller(UserService userService){
        this.userService=userService;
    }

    @PostMapping("/user")
    public User addUserDetails(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/user")
    public List<User> getAllUserDetail() {
        return userService.getALlUser();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserDetails(@PathVariable int id) {
        User user=userService.getUserDetials(id);
        return ResponseEntity.ok(user);

    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUserDetails(@PathVariable int id, @RequestBody User user)
    {
        User updateduser=userService.updateUserDetails(id,user);
        return ResponseEntity.ok(updateduser);
    }
    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id)
    {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }



}
