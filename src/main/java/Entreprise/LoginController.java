package Entreprise;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private ApplicationUserRepository applicationUserRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private UserAppService userAppService;

    LoginController(ApplicationUserRepository applicationUserRepository,
                    BCryptPasswordEncoder bCryptPasswordEncoder, UserAppService userAppService) {
        this.applicationUserRepository = applicationUserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.userAppService = userAppService;
    }

    @PostMapping("/sign-up")
    public ResponseEntity register(@RequestBody() UserAppDTO em){
        if(userAppService.usernameExist(em.getUsername())){
            return new ResponseEntity(HttpStatus.CONFLICT);
        }
        em.setPassword(bCryptPasswordEncoder.encode(em.getPassword()));

        userAppService.put(UserAppMapper.DTOToUserApp(em));
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
