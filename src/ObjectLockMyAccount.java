
public class ObjectLockMyAccount {
	
	private String oid;
	private int cash;
	
	public ObjectLockMyAccount(String oid,int cash) {
		// TODO Auto-generated constructor stub
		this.setCash(cash);
		this.setOid(oid);
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}
	
	@Override
	public String toString(){
		return "MyCount{" +"oid='" + oid + '\'' +", cash=" + cash +'}';
	}
}
