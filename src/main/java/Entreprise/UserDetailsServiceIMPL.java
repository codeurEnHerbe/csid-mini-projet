package Entreprise;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceIMPL implements UserDetailsService {
    UserAppRepository rep;
    UserDetailsServiceIMPL(UserAppRepository rep){
        this.rep=rep;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserAppEntity user = rep.findByUsername(s);
        if (user == null) {
            throw new UsernameNotFoundException(s);
        }

        List<GrantedAuthority> granAut = new ArrayList<GrantedAuthority>();
        return new User(user.getUsername(),user.getPassword(), granAut);
    }
}