package com.fixed.utility.models;

import com.fixed.utility.authority.entity.Authorities;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author bypt-dev-laptop-9
 */
@Getter
@Setter
public class UserModel {
    
    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String accessToken;
    private Set<Authorities> authorities;
    
}
