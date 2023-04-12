package com.infomation.main;

import com.infomation.controller.HospitalInfoController;

public class Main {

	public static void main(String[] args) {
		//프로젝트를 실행 시켜주는 클래스
		//저장된 list 값을 유지 하기 위해 변수로 주소값을 가지고 있음
		HospitalInfoController controller = new HospitalInfoController();
		controller.intputData(); //프로젝트에 저장된 병원정보 csv파일을 가져와 java클래스에 대입하는 매소드(기능)
		controller.printHospitalData();//대입된 내용을 출력해주는 매소드(기능)
	}

}
