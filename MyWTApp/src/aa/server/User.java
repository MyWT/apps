package aa.server;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import rnd.webapp.mwt.client.utils.ObjectUtils;
import rnd.webapp.mwt.server.bean.ApplicationJavaBean;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class User extends ApplicationJavaBean {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long userId;

	@Persistent
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String newUserName) {
		if (ObjectUtils.areEqual(this.userName, newUserName)) {
			return;
		}
		this.userName = newUserName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long newUserId) {
		this.userId = newUserId;
	}
}