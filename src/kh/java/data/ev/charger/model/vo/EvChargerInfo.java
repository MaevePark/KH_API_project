package kh.java.data.ev.charger.model.vo;

//자료형 결정 하는 것 
public class EvChargerInfo {
//	결과코드	resultCode	2	필	00	결과코드
	private int resultCode;
//	결과메시지	resultMsg	50	필	OK	결과메시지
	private String resultMag;
//	전체 결과 수	totalCount	9	필	36000	전체 결과 수
	private int totalCount;
//	페이지 번호	pageNo	5	필	1	조회 페이지
	private int pageNo;
//	한 페이지 결과 수	numOfRows	5	필	1000	한 페이지 결과 수
	private int numOfRows;
//	충전소명	statNm	100	필	기후대기관	충전소명
	private String statNm;
//	충전소ID	statId	8	필	28260005	충전소ID
	private String statId;
//	충전기ID	chgerId	2	필	01	충전기ID
	private String chgerId;
//	충전기타입	chgerType	2	필	03	충전기타입
	private String chgerType;
//	소재지 도로명 주소	addr	150	필	인천광역시 서구 환경로 42	주소
	private String addr;
//	위도	lat	15	필	37.569620	위도
	private String lat;
//	경도	lng	15	필	126.641973	경도
	private String lng;
//	이용가능시간	useTime	50	필	24시간 이용가능	이용가능시간
	private String useTime;
//	기관ID	busiId	2	필	ME	기관ID
	private String busiId;
//	운영기관명	busiNm	50	필	환경부	운영기관명
	private String busiNm;
//	관리업체 전화번호	busiCall	20	필	1661-9408	충전기 운영기관 연락처
	private String busiCall;
//	충전기상태	stat	1	필	2	충전기상태
	private String stat; // TODO char
//	상태갱신일시	statUpdDt	14	필	20190829121020	충전기 상태 변경 일시
	private String statUpdDt; // TODO date.util.Date or java.sql.Date
//	충전기용량	powerType	20	필	급속(100kWh동시)	충전기용량
	private String powerType;
//	지역코드	zcode	2	필	28	시도 코드(행정구역코드 앞2자리)
	private String zcode;
//	주차료무료 여부	parkingFree	1	옵	Y	주차료(Y:무료, N:유료, NULL:현장확인)
	private String parkingFree;
//	충전소 안내	note	200	옵	공사로 인해 이용 불가	이용제한, 주차요금 등 충전소 안내
	private String note;
	
	
	public EvChargerInfo() {
		super();
}

	public EvChargerInfo(int resultCode, String resultMag, int totalCount, int pageNo, int numOfRows, String statNm,
			String statId, String chgerId, String chgerType, String addr, String lat, String lng, String useTime,
			String busiId, String busiNm, String busiCall, String stat, String statUpdDt, String powerType,
			String zcode, String parkingFree, String note) {
		super();
		this.resultCode = resultCode;
		this.resultMag = resultMag;
		this.totalCount = totalCount;
		this.pageNo = pageNo;
		this.numOfRows = numOfRows;
		this.statNm = statNm;
		this.statId = statId;
		this.chgerId = chgerId;
		this.chgerType = chgerType;
		this.addr = addr;
		this.lat = lat;
		this.lng = lng;
		this.useTime = useTime;
		this.busiId = busiId;
		this.busiNm = busiNm;
		this.busiCall = busiCall;
		this.stat = stat;
		this.statUpdDt = statUpdDt;
		this.powerType = powerType;
		this.zcode = zcode;
		this.parkingFree = parkingFree;
		this.note = note;
	}

	@Override
	public String toString() {
		return "EvChargerInfo [resultCode=" + resultCode + ", resultMag=" + resultMag + ", totalCount=" + totalCount
				+ ", pageNo=" + pageNo + ", numOfRows=" + numOfRows + ", statNm=" + statNm + ", statId=" + statId
				+ ", chgerId=" + chgerId + ", chgerType=" + chgerType + ", addr=" + addr + ", lat=" + lat + ", lng="
				+ lng + ", useTime=" + useTime + ", busiId=" + busiId + ", busiNm=" + busiNm + ", busiCall=" + busiCall
				+ ", stat=" + stat + ", statUpdDt=" + statUpdDt + ", powerType=" + powerType + ", zcode=" + zcode
				+ ", parkingFree=" + parkingFree + ", note=" + note + "]";
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMag() {
		return resultMag;
	}

	public void setResultMag(String resultMag) {
		this.resultMag = resultMag;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getNumOfRows() {
		return numOfRows;
	}

	public void setNumOfRows(int numOfRows) {
		this.numOfRows = numOfRows;
	}

	public String getStatNm() {
		return statNm;
	}

	public void setStatNm(String statNm) {
		this.statNm = statNm;
	}

	public String getStatId() {
		return statId;
	}

	public void setStatId(String statId) {
		this.statId = statId;
	}

	public String getChgerId() {
		return chgerId;
	}

	public void setChgerId(String chgerId) {
		this.chgerId = chgerId;
	}

	public String getChgerType() {
		return chgerType;
	}

	public void setChgerType(String chgerType) {
		this.chgerType = chgerType;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getUseTime() {
		return useTime;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

	public String getBusiId() {
		return busiId;
	}

	public void setBusiId(String busiId) {
		this.busiId = busiId;
	}

	public String getBusiNm() {
		return busiNm;
	}

	public void setBusiNm(String busiNm) {
		this.busiNm = busiNm;
	}

	public String getBusiCall() {
		return busiCall;
	}

	public void setBusiCall(String busiCall) {
		this.busiCall = busiCall;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getStatUpdDt() {
		return statUpdDt;
	}

	public void setStatUpdDt(String statUpdDt) {
		this.statUpdDt = statUpdDt;
	}

	public String getPowerType() {
		return powerType;
	}

	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}

	public String getZcode() {
		return zcode;
	}

	public void setZcode(String zcode) {
		this.zcode = zcode;
	}

	public String getParkingFree() {
		return parkingFree;
	}

	public void setParkingFree(String parkingFree) {
		this.parkingFree = parkingFree;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
}



 