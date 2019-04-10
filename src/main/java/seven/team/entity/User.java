package seven.team.entity;

import org.litepal.crud.DataSupport;

import java.io.Serializable;

public class User extends DataSupport implements Serializable{

    private String nickname;

    private int headId;

    private String userId;

    private String password;

    public void setHeadId(int headId){ this.headId = headId; }

    public int getHeadId(){ return this.headId; }

    public void setNickname(String nickname){ this.nickname = nickname; }

    public String getNickname(){ return this.nickname; }

    public void setUserId(String userId) { this.userId = userId; }

    public void setPassword(String password) { this.password = password; }

    public String getUserId() { return userId; }

    public String getPassword() { return password; }
}
