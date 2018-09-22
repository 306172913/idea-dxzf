package org.lanqiao.dxzf.entity;

public class Priv {
	private int pid;
	private String pname;
	private String phref;
	private String pclass;
	
	public Priv() {
		super();
	}
	
	public Priv(String pname, String phref, String pclass) {
		super();
		this.pname = pname;
		this.phref = phref;
		this.pclass = pclass;
	}

	public Priv(int pid, String pname, String phref, String pclass) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.phref = phref;
		this.pclass = pclass;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPhref() {
		return phref;
	}
	public void setPhref(String phref) {
		this.phref = phref;
	}
	public String getPclass() {
		return pclass;
	}
	public void setPclass(String pclass) {
		this.pclass = pclass;
	}
	@Override
	public String toString() {
		return "Priv [pid=" + pid + ", pname=" + pname + ", phref=" + phref + ", pclass=" + pclass + "]";
	}
	
}
