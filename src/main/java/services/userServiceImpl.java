package services;

import entities.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repositories.userRepository;

@Service
@AllArgsConstructor
public class userServiceImpl implements userService {

    private userRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long userID) {
        userRepository.deleteById(userID);

    }

    @Override
    public User getUserById(Long userID) {
        return userRepository.getById(userID);
    }



    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
