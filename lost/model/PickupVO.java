package model;

public class PickupVO {//찾아가세요 분실물 VO

	private int pino;
	private String pithing;
	private String pithingmore;
	private String piloc;
	private String pidate;
	private String pitime;
	private String storage;
	private String regidate;
	private String yourinfo;
	

	public PickupVO() {
		// TODO Auto-generated constructor stub
	}


	public PickupVO(int pino, String pithing, String pithingmore, String piloc, String pidate, String pitime,
			String storage, String regidate, String yourinfo) {
		super();
		this.pino = pino;
		this.pithing = pithing;
		this.pithingmore = pithingmore;
		this.piloc = piloc;
		this.pidate = pidate;
		this.pitime = pitime;
		this.storage = storage;
		this.regidate = regidate;
		this.yourinfo = yourinfo;
	}


	public int getPino() {
		return pino;
	}

	public void setPino(int pino) {
		this.pino = pino;
	}

	public String getPithing() {
		return pithing;
	}

	public void setPithing(String pithing) {
		this.pithing = pithing;
	}

	public String getPithingmore() {
		return pithingmore;
	}

	public void setPithingmore(String pithingmore) {
		this.pithingmore = pithingmore;
	}

	public String getPiloc() {
		return piloc;
	}

	public void setPiloc(String piloc) {
		this.piloc = piloc;
	}

	public String getPidate() {
		return pidate;
	}

	public void setPidate(String pidate) {
		this.pidate = pidate;
	}

	public String getPitime() {
		return pitime;
	}

	public void setPitime(String pitime) {
		this.pitime = pitime;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getRegidate() {
		return regidate;
	}

	public void setRegidate(String regidate) {
		this.regidate = regidate;
	}

	public String getYourinfo() {
		return yourinfo;
	}

	public void setYourinfo(String yourinfo) {
		this.yourinfo = yourinfo;
	}





}