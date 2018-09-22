package org.lanqiao.dxzf.entity;

import java.util.List;

public class Role {
	private int rid;
	private String rname;
	private String rinfo;
	private List<Priv> lp;
	private String privs;
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(int rid, String rname, String rinfo, List<Priv> lp, String privs) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.rinfo = rinfo;
		this.lp = lp;
		this.privs = privs;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRinfo() {
		return rinfo;
	}
	public void setRinfo(String rinfo) {
		this.rinfo = rinfo;
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
	public String getPrivs() {
		return privs;
	}
	public void setPrivs(String privs) {
		this.privs = privs;
	}
	@Override
	public String toString() {
		return "Role [rid=" + rid + ", rname=" + rname + ", rinfo=" + rinfo + ", lp=" + lp + ", privs=" + privs + "]";
	}

	
}
