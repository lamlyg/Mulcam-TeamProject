package model;

public class LostVO {//찾아주세요 분실물 VO
	private int lono;
	private String lothing;
	private String lothingmore;
	private String loloc;
	private String lodate;
	private String lotime;
	private String regidate;
	private String loyourinfo ;

	public LostVO() {

	}


	public LostVO(int lono, String lothing, String lothingmore, String loloc, String lodate, String lotime, String regidate,
			String loyourinfo) {
		super();
		this.lono = lono;
		this.lothing = lothing;
		this.lothingmore = lothingmore;
		this.loloc = loloc;
		this.lodate = lodate;
		this.lotime = lotime;
		this.regidate = regidate;
		this.loyourinfo = loyourinfo;
	}


	public int getLono() {
		return lono;
	}

	public void setLono(int lono) {
		this.lono = lono;
	}

	public String getLothing() {
		return lothing;
	}

	public void setLothing(String lothing) {
		this.lothing = lothing;
	}

	public String getLothingmore() {
		return lothingmore;
	}

	public void setLothingmore(String lothingmore) {
		this.lothingmore = lothingmore;
	}

	public String getLoloc() {
		return loloc;
	}

	public void setLoloc(String loloc) {
		this.loloc = loloc;
	}

	public String getLodate() {
		return lodate;
	}

	public void setLodate(String lodate) {
		this.lodate = lodate;
	}

	public String getLotime() {
		return lotime;
	}

	public void setLotime(String lotime) {
		this.lotime = lotime;
	}

	public String getRegidate() {
		return regidate;
	}

	public void setRegidate(String regidate) {
		this.regidate = regidate;
	}

	public String getLoyourinfo() {
		return loyourinfo;
	}

	public void setLoyourinfo(String loyourinfo) {
		this.loyourinfo = loyourinfo;
	}


}