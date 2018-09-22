package org.lanqiao.dxzf.entity;

import java.util.List;

public class Admin {
	private int aid = -1;//初始化为-1
	private String aaccount;//账户
	private String apsw;//密码
	private String aphoto;//头像
	private String aidcard;//身份证号
	private String aname;//姓名
	private String atel;//电话
	private String aemail;//email
	private String acreate;//注册时间
	private String apriv; //授权时间
	private List<Role> lr;//角色集合
	private List<Priv> lp;//权限集合
	private String roles;//界面显示拥有的角色
	private String privs;//界面显示拥有的权限
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Admin(String aaccount, String apsw) {
		super();
		this.aaccount = aaccount;
		this.apsw = apsw;
	}
	
	public Admin(String aname, String atel, String aemail) {
		super();
		this.aname = aname;
		this.atel = atel;
		this.aemail = aemail;
	}

	public Admin(int aid, String aaccount, String apsw, String aphoto, String aidcard, String aname, String atel,
			String aemail, String acreate, String apriv) {
		super();
		this.aid = aid;
		this.aaccount = aaccount;
		this.apsw = apsw;
		this.aphoto = aphoto;
		this.aidcard = aidcard;
		this.aname = aname;
		this.atel = atel;
		this.aemail = aemail;
		this.acreate = acreate;
		this.apriv = apriv;
	}

	public Admin(int aid, String aaccount, String apsw, String aphoto, String aidcard, String aname, String atel,
			String aemail, String acreate, String apriv, List<Role> lr, List<Priv> lp, String roles, String privs) {
		super();
		this.aid = aid;
		this.aaccount = aaccount;
		this.apsw = apsw;
		this.aphoto = aphoto;
		this.aidcard = aidcard;
		this.aname = aname;
		this.atel = atel;
		this.aemail = aemail;
		this.acreate = acreate;
		this.apriv = apriv;
		this.lr = lr;
		this.lp = lp;
		this.roles = roles;
		this.privs = privs;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAaccount() {
		return aaccount;
	}
	public void setAaccount(String aaccount) {
		this.aaccount = aaccount;
	}
	public String getApsw() {
		return apsw;
	}
	public void setApsw(String apsw) {
		this.apsw = apsw;
	}
	public String getAphoto() {
		return aphoto;
	}
	public void setAphoto(String aphoto) {
		this.aphoto = aphoto;
	}
	public String getAidcard() {
		return aidcard;
	}
	public void setAidcard(String aidcard) {
		this.aidcard = aidcard;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAtel() {
		return atel;
	}
	public void setAtel(String atel) {
		this.atel = atel;
	}
	public String getAemail() {
		return aemail;
	}
	public void setAemail(String aemail) {
		this.aemail = aemail;
	}
	public String getAcreate() {
		return acreate;
	}
	public void setAcreate(String acreate) {
		this.acreate = acreate;
	}
	public String getApriv() {
		return apriv;
	}
	public void setApriv(String apriv) {
		this.apriv = apriv;
	}
	public List<Role> getLr() {
		return lr;
	}
	public void setLr(List<Role> lr) {
		String roles = "";
		for(int i=0;i<lr.size();i++) {
			if(i==0) roles= lr.get(i).getRname();
			else roles += "、"+lr.get(i).getRname();
		}
		this.roles = roles;
		this.lr = lr;
	}
	public List<Priv> getLp() {
		return lp;
	}
	public void setLp(List<Priv> lp) {
		String privs = "";
		for(int i=0;i<lp.size();i++) {
			if(i==0) privs= lp.get(i).getPname();
			else privs += "、"+lp.get(i).getPname();
		}
		this.privs = privs;
		this.lp = lp;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getPrivs() {
		return privs;
	}
	public void setPrivs(String privs) {
		this.privs = privs;
	}
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", aaccount=" + aaccount + ", apsw=" + apsw + ", aphoto=" + aphoto + ", aidcard="
				+ aidcard + ", aname=" + aname + ", atel=" + atel + ", aemail=" + aemail + ", acreate=" + acreate
				+ ", apriv=" + apriv + ", lr=" + lr + ", lp=" + lp + ", roles=" + roles + ", privs=" + privs + "]";
	}
	
}
