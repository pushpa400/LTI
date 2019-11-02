package model;

public class CM {
	private String cid;
	private String cname;
	private String qcategory;
	private String scategory;
	private String enddate;
	private String party;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getQcategory() {
		return qcategory;
	}
	public void setQcategory(String qcategory) {
		this.qcategory = qcategory;
	}
	public String getScategory() {
		return scategory;
	}
	public void setScategory(String scategory) {
		this.scategory = scategory;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public CM(String cid, String cname, String qcategory, String scategory, String enddate, String party) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.qcategory = qcategory;
		this.scategory = scategory;
		this.enddate = enddate;
		this.party = party;
	}
	public CM() {
		super();
	}
	
	
	
}
