package com.fixed.utility.user.entity;

import com.fixed.utility.authority.entity.Authorities;
import com.fixed.utility.util.AbstractDomain;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Sandeep Patel
 */
@Entity(name = "user")
@Getter
@Setter
public class User extends AbstractDomain {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    
    private String password;

    private String firstName;

    private String lastName;
    
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Authorities> authorities;

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName + ", authorities=" + authorities + '}';
    }
    
}
