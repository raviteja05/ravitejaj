package com.krypton.security;

import java.util.List;

import javax.annotation.Resource;

import org.bson.Document;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.krypton.mongo.services.MongoDBService;
import com.krypton.mongo.services.MongoDaoService;
import com.krypton.security.models.MongoUserDetails;
import com.mongodb.client.model.Filters;
@Service
public class KryptonSecurityService implements UserDetailsService{
	@Resource
	private MongoDaoService mongoDaoService;

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Document document=mongoDaoService.find(Filters.eq("email",username), "user");
		if(document!=null) {
            String name = document.getString("firstName");
            String surname = document.getString("lastName");
            String password = document.getString("password");
            List<String> authorities = (List<String>) document.get("authorities");
            MongoUserDetails mongoUserDetails = new MongoUserDetails(username,password,null);
            return mongoUserDetails;
        }
        return null;
	}

}
