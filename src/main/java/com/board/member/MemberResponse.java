package com.board.member;

public class MemberResponse {
	private final Long memberId;
	private final String username;

	public MemberResponse(Long memberId, String username) {
		this.memberId = memberId;
		this.username = username;
	}
}
