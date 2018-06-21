package cloud.services;

import cloud.entities.User;
import cloud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;


    public void increasePostByOne(String id) {
        User user = userRepository.findById(id);
        int post = user.getPost() + 1;
        userRepository.updatePostById(post, id);
    }

    public void decreasePostByOne(String id) {
        User user = userRepository.findById(id);
        int post = user.getPost() - 1;
        userRepository.updatePostById(post, id);
    }

    public void increaseFollowerByOne(String id) {
        User user = userRepository.findById(id);
        int post = user.getFollower() + 1;
        userRepository.updateFollowerById(post, id);
    }

    public void decreaseFollowerByOne(String id) {
        User user = userRepository.findById(id);
        int post = user.getFollower() - 1;
        userRepository.updateFollowerById(post, id);
    }

    public void increaseFollowingByOne(String id) {
        User user = userRepository.findById(id);
        int post = user.getFollowing() + 1;
        userRepository.updateFollowingById(post, id);
    }

    public void decreaseFollowingByOne(String id) {
        User user = userRepository.findById(id);
        int post = user.getFollowing() - 1;
        userRepository.updateFollowingById(post, id);
    }


}