package Entreprise;

import org.springframework.stereotype.Service;

@Service
public class UserAppService {
    UserAppRepository userRepository;

    public UserAppService(UserAppRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean put(UserApp e){
        if(userRepository.findAll().stream().filter(employee -> employee.getUsername() == e.getUsername()).findFirst().isPresent()){
            return false;
        }else{
            userRepository.save(UserAppMapper.UserAppToEntity(e));
            System.out.println(e);
            return true;
        }
    }

    public boolean usernameExist(String username){
        return userRepository.findAll().stream().filter(user -> user.getUsername().equals(username)).findFirst().isPresent();
    }
}
