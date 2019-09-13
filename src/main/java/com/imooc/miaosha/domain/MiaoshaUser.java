package com.imooc.miaosha.domain;

import java.util.Date;

public class MiaoshaUser {
	private Long id;
	private String nickname;
	private String passwords;
	private String salt;
	private String head;
	private Date registerDate;
	private Date lastLoginDate;
	private Integer loginCount;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return passwords;
	}
	public void setPassword(String passwords) {
		this.passwords = passwords;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public Integer getLoginCount() {
		return loginCount;
	}
	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MiaoshaUser [id=");
		builder.append(id);
		builder.append(", nickname=");
		builder.append(nickname);
		builder.append(", passwords=");
		builder.append(passwords);
		builder.append(", salt=");
		builder.append(salt);
		builder.append(", head=");
		builder.append(head);
		builder.append(", registerDate=");
		builder.append(registerDate);
		builder.append(", lastLoginDate=");
		builder.append(lastLoginDate);
		builder.append(", loginCount=");
		builder.append(loginCount);
		builder.append("]");
		return builder.toString();
	}
	
}
