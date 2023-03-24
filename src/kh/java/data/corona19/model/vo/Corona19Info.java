package kh.java.data.corona19.model.vo;

public class Corona19Info {
	
//	누적확진자수	defCnt	20	필	159481	누적확진자수
//	시도명	gubun	100	필	경기	시도명
//	시도명(중문)	gubunCn	100	옵	京畿	시도명(중문)
//	시도명(영문)	gubunEn	200	옵	Gyeonggi-do	시도명(영문)
//	전일대비확진자증감수	incDec	10	옵	2299	전일대비확진자증감수
//	누적격리해제수	isolClearCnt	20	옵	132485	누적격리해제수
//	격리중환자수	isolIngCnt	20	옵	0	격리중환자수
//	지역발생수	localOccCnt	20	옵	2296	지역발생수
//	해외유입수	overFlowCnt	20	옵	3	해외유입수
//	만명당발생율	qurRate	20	옵	1188	만명당발생율
//	기준일자	stdDay	20	필	2021-12-15	기준일자
//	<deathCnt>16</deathCnt>
	private long deathCnt;
//	<defCnt>6560</defCnt>
	private long defCnt;
//	<gubun>검역</gubun>
	private String gubun;
//	<gubunCn>隔離區</gubunCn>
	private String gubunCn;
//	<gubunEn>Lazaretto</gubunEn>
	private String gubunEn;
//	<incDec>4</incDec>
	private long incDec;
//	<isolClearCnt>6369</isolClearCnt>
	private long isolClearCnt;
//	<isolIngCnt>0</isolIngCnt>
	private long isolIngCnt;
//	<localOccCnt>0</localOccCnt>
	private long localOccCnt;
//	<overFlowCnt>4</overFlowCnt>
	private long overFlowCnt;
//	<qurRate>-</qurRate>
	private long qurRate;
//	<stdDay>2021-12-15</stdDay>
	private String stdDay;
	
	// 아래 순서대로 generator
	// Constructor 기본
	// Constructor field all
	// toString all
	// getter / setter
	
	public Corona19Info() {
		super();
	}


	public Corona19Info(long deathCnt, long defCnt, String gubun, String gubunCn, String gubunEn, long incDec,
			long isolClearCnt, long isolIngCnt, long localOccCnt, long overFlowCnt, long qurRate, String stdDay) {
		super();
		this.deathCnt = deathCnt;
		this.defCnt = defCnt;
		this.gubun = gubun;
		this.gubunCn = gubunCn;
		this.gubunEn = gubunEn;
		this.incDec = incDec;
		this.isolClearCnt = isolClearCnt;
		this.isolIngCnt = isolIngCnt;
		this.localOccCnt = localOccCnt;
		this.overFlowCnt = overFlowCnt;
		this.qurRate = qurRate;
		this.stdDay = stdDay;
	}


	@Override
	public String toString() {
		return "Corona19Info [deathCnt=" + deathCnt + ", defCnt=" + defCnt + ", gubun=" + gubun + ", gubunCn=" + gubunCn
				+ ", gubunEn=" + gubunEn + ", incDec=" + incDec + ", isolClearCnt=" + isolClearCnt + ", isolIngCnt="
				+ isolIngCnt + ", localOccCnt=" + localOccCnt + ", overFlowCnt=" + overFlowCnt + ", qurRate=" + qurRate
				+ ", stdDay=" + stdDay + "]";
	}


	public long getDeathCnt() {
		return deathCnt;
	}


	public void setDeathCnt(long deathCnt) {
		this.deathCnt = deathCnt;
	}


	public long getDefCnt() {
		return defCnt;
	}


	public void setDefCnt(long defCnt) {
		this.defCnt = defCnt;
	}


	public String getGubun() {
		return gubun;
	}


	public void setGubun(String gubun) {
		this.gubun = gubun;
	}


	public String getGubunCn() {
		return gubunCn;
	}


	public void setGubunCn(String gubunCn) {
		this.gubunCn = gubunCn;
	}


	public String getGubunEn() {
		return gubunEn;
	}


	public void setGubunEn(String gubunEn) {
		this.gubunEn = gubunEn;
	}


	public long getIncDec() {
		return incDec;
	}


	public void setIncDec(long incDec) {
		this.incDec = incDec;
	}


	public long getIsolClearCnt() {
		return isolClearCnt;
	}


	public void setIsolClearCnt(long isolClearCnt) {
		this.isolClearCnt = isolClearCnt;
	}


	public long getIsolIngCnt() {
		return isolIngCnt;
	}


	public void setIsolIngCnt(long isolIngCnt) {
		this.isolIngCnt = isolIngCnt;
	}


	public long getLocalOccCnt() {
		return localOccCnt;
	}


	public void setLocalOccCnt(long localOccCnt) {
		this.localOccCnt = localOccCnt;
	}


	public long getOverFlowCnt() {
		return overFlowCnt;
	}


	public void setOverFlowCnt(long overFlowCnt) {
		this.overFlowCnt = overFlowCnt;
	}


	public long getQurRate() {
		return qurRate;
	}


	public String getStdDay() {
		return stdDay;
	}


	public void setStdDay(String stdDay) {
		this.stdDay = stdDay;
	}


	public void setQurRate(long qurRate) {
		this.qurRate = qurRate;
	}



	
}








