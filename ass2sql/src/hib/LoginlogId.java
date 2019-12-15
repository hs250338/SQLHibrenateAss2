package hib;
// Generated 17:52:00 15/12/2019 by Hibernate Tools 4.3.5.Final

import java.io.Serializable;

/**
 * LoginlogId generated by hbm2java
 */
public class LoginlogId implements java.io.Serializable {

	private Serializable logintime;
	private int userid;

	public LoginlogId() {
	}

	public LoginlogId(Serializable logintime, int userid) {
		this.logintime = logintime;
		this.userid = userid;
	}

	public Serializable getLogintime() {
		return this.logintime;
	}

	public void setLogintime(Serializable logintime) {
		this.logintime = logintime;
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LoginlogId))
			return false;
		LoginlogId castOther = (LoginlogId) other;

		return ((this.getLogintime() == castOther.getLogintime()) || (this.getLogintime() != null
				&& castOther.getLogintime() != null && this.getLogintime().equals(castOther.getLogintime())))
				&& (this.getUserid() == castOther.getUserid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getLogintime() == null ? 0 : this.getLogintime().hashCode());
		result = 37 * result + this.getUserid();
		return result;
	}

}
