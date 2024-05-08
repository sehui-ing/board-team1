package com.board.member;

import com.board.common.UnAuthorizedException;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Member {
	@Setter
	private Long id;
	private String username;
	private String password;

	public Member(Long id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public void login(String password) {
		if (this.password.equals(password)) {
			return;
		}
		throw new UnAuthorizedException("비밀번호가 일치하지 않습니다");
	}
}
