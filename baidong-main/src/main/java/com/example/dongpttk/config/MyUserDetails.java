package com.example.dongpttk.config;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import com.example.dongpttk.model.Tblthanhvien;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class MyUserDetails implements UserDetails {

    private Tblthanhvien user;
    private final Set<GrantedAuthority> authorities = new HashSet<>();

    public MyUserDetails(Tblthanhvien user) {
        authorities.add(new SimpleGrantedAuthority("USER"));
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //SimpleGrantedAuthority authority = new SimpleGrantedAuthority(user.getRole());
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


}
