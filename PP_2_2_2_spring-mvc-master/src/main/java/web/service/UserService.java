package web.service;

import org.springframework.stereotype.Service;
import web.model.User;
import web.repository.UserRepository;

import java.util.List;

@Service
public class UserService implements UserServiceInterface {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @Override
    public void add(User user) {
        userRepository.addUser(user);

    }
    @Override
    public List<User> listUsers() {
        return userRepository.getAllUsers();

    }

    @Override
    public User readUser(long id) {
        return userRepository.readUser(id);
    }

    @Override
    public void edit(User user) {
        userRepository.edit(user);
    }

}
