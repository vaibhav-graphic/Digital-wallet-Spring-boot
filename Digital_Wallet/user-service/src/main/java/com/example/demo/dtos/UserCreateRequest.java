package com.example.demo.dtos;

import com.example.demo.models.User;
import com.example.demo.utils.StringConstants;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCreateRequest {
	private String name;
	private String mobile;
	private String email;
	private String password;
	
	public User to() {
		return User.builder()
				.name(name)
				.mobile(mobile)
				.email(email)
				.password(password)
				.authorities(StringConstants.USER_AUTHORITY)
				.build();
	}
	
}
