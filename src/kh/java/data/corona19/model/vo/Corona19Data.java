package kh.java.data.corona19.model.vo;

public class Corona19Data {
		//1. 공공데이터에 출력결과에 첫 행(목차) 빼고 복붙 + 주석처리 후 코드입력
		//2. 하나씩 접근제한자, 자료형, 이름 등 결과 값에 맞춰서 코드로 한줄씩 작성
		//3. alt + shift + s 로 기본생성자 + 생성자 + toString 오버라이드 + getter,setter 만들기
		//4.
		
//		결과코드	resultCode	2	필	00	결과코드
		private int resultCode;
//		결과메시지	resultMsg	50	필	OK	결과메시지
		private String resultMsg;
//		한 페이지 결과 수	numOfRows	4	필	500	한 페이지 결과 수
		private int numOfRows;
//		페이지 번호	pageNo	4	필	1	페이지번호
		private int pageNo;
//		전체 결과 수	totalCount	4	필	15504	전체 결과 수
		private int totalCount;
//		누적확진자수	defCnt	20	필	159481	누적확진자수
		private int defCnt;
//		시도명	gubun	100	필	경기	시도명
		private String gubun;
//		시도명(중문)	gubunCn	100	옵	京畿	시도명(중문)
		private String gubunCn;
//		시도명(영문)	gubunEn	200	옵	Gyeonggi-do	시도명(영문)
		private String gubunEn;
//		전일대비확진자증감수	incDec	10	옵	2299	전일대비확진자증감수
		private int incDec;
//		누적격리해제수	isolClearCnt	20	옵	132485	누적격리해제수
		private int isolClearCnt;
//		격리중환자수	isolIngCnt	20	옵	0	격리중환자수
		private int isolIngCnt;
//		지역발생수	localOccCnt	20	옵	2296	지역발생수
		private int localOccCnt;
//		해외유입수	overFlowCnt	20	옵	3	해외유입수
		private int overFlowCnt;
//		만명당발생율	qurRate	20	옵	1188	만명당발생율
		private double qurRate;
//		기준일자	stdDay	20	필	2021-12-15	기준일자
		private String stdDay;

		
		public Corona19Data() {
			super();
		
}
		public Corona19Data(int resultCode, String resultMsg, int numOfRows, int pageNo, int totalCount, int defCnt,
				String gubun, String gubunCn, String gubunEn, int incDec, int isolClearCnt, int isolIngCnt,
				int localOccCnt, int overFlowCnt, double qurRate, String stdDay) {
			super();
			this.resultCode = resultCode;
			this.resultMsg = resultMsg;
			this.numOfRows = numOfRows;
			this.pageNo = pageNo;
			this.totalCount = totalCount;
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
			return "Corona19Data [resultCode=" + resultCode + ", resultMsg=" + resultMsg + ", numOfRows=" + numOfRows
					+ ", pageNo=" + pageNo + ", totalCount=" + totalCount + ", defCnt=" + defCnt + ", gubun=" + gubun
					+ ", gubunCn=" + gubunCn + ", gubunEn=" + gubunEn + ", incDec=" + incDec + ", isolClearCnt="
					+ isolClearCnt + ", isolIngCnt=" + isolIngCnt + ", localOccCnt=" + localOccCnt + ", overFlowCnt="
					+ overFlowCnt + ", qurRate=" + qurRate + ", stdDay=" + stdDay + "]";
		}
		public int getResultCode() {
			return resultCode;
		}
		public void setResultCode(int resultCode) {
			this.resultCode = resultCode;
		}
		public String getResultMsg() {
			return resultMsg;
		}
		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}
		public int getNumOfRows() {
			return numOfRows;
		}
		public void setNumOfRows(int numOfRows) {
			this.numOfRows = numOfRows;
		}
		public int getPageNo() {
			return pageNo;
		}
		public void setPageNo(int pageNo) {
			this.pageNo = pageNo;
		}
		public int getTotalCount() {
			return totalCount;
		}
		public void setTotalCount(int totalCount) {
			this.totalCount = totalCount;
		}
		public int getDefCnt() {
			return defCnt;
		}
		public void setDefCnt(int defCnt) {
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
		public int getIncDec() {
			return incDec;
		}
		public void setIncDec(int incDec) {
			this.incDec = incDec;
		}
		public int getIsolClearCnt() {
			return isolClearCnt;
		}
		public void setIsolClearCnt(int isolClearCnt) {
			this.isolClearCnt = isolClearCnt;
		}
		public int getIsolIngCnt() {
			return isolIngCnt;
		}
		public void setIsolIngCnt(int isolIngCnt) {
			this.isolIngCnt = isolIngCnt;
		}
		public int getLocalOccCnt() {
			return localOccCnt;
		}
		public void setLocalOccCnt(int localOccCnt) {
			this.localOccCnt = localOccCnt;
		}
		public int getOverFlowCnt() {
			return overFlowCnt;
		}
		public void setOverFlowCnt(int overFlowCnt) {
			this.overFlowCnt = overFlowCnt;
		}
		public double getQurRate() {
			return qurRate;
		}
		public void setQurRate(double qurRate) {
			this.qurRate = qurRate;
		}
		public String getStdDay() {
			return stdDay;
		}
		public void setStdDay(String stdDay) {
			this.stdDay = stdDay;
		}
		
		
		
}
