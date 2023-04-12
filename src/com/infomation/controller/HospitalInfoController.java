package com.infomation.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.infomation.vo.Hospital;

public class HospitalInfoController {
	// Hospital객체를 관리하는 클래스
	private List<Hospital> list = new ArrayList<Hospital>();

	public void intputData() {
		// csv파일 불러오기
		String path = HospitalInfoController.class.getResource("/").getPath();
//		System.out.println(path);
		File data = new File(path + "/1.병원정보서비스 2022.6.csv");
//		System.out.println(data.getName());
		StringBuffer sb = new StringBuffer();
		// 문자열로 저장되어있어 Reader를 이용하고 받아오는 속도를 향상하기 위해
		// BufferedReader보조 스트림을 사용하였다.
		// 각데이터를 라인별로 받아서 StringBuffer에 저장하여 관리함.
		BufferedReader breader = null;
		try {
			breader = new BufferedReader(new FileReader(data));
			String ch = "";
			while ((ch = breader.readLine()) != null) {
				sb.append(ch + "\n"); // csv 에서 받아온 파일을 StringBuffer에 저장
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(breader!=null)
					breader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
	
		String[] datas = sb.toString().split("\n");// 버퍼에 저장된내용을 라인별로 나눠서 배열로 저장
		int cnt = 0;
		for (String d : datas) {
			if(cnt == 10) break;
			cnt++;
//			System.out.println(d);
			
			String[] detail = d.replace("\",", "@").replace("\"", "").split("@");// 항목별로 다시 배열로 저장하여 각 데이터 불러오기
//			for(String a : detail) {
//				System.out.println(a);
//			}
			// csv에서 사용한 ,가 주소를 표시하는 부분에도 있어 항목을 구분한 ,를 @로 변경하여 파싱하고, 데이터 부분은 모두 ""이 붙어있어 이를
			// 제거하는 구문이다.
			// 원하는 항목만 hospital 객체에 대입하여 저장하기.
			int count = 0; // csv의 최초라인이 항목명을 가져오고있어 그부분에대한 예외처리 구문
			try {
				count = Integer.parseInt(detail[16]);
			} catch (NumberFormatException e) {
			}
			// 모든 항목데이터가 배열로 대입이 되어있어, 배열의 인덱스로 해당하는 자료를 대입하는 구문
			//list.add(new Hospital(detail[3], detail[1], detail[5], detail[7], detail[10], detail[11], detail[12], detail[13],
			//		count));
			list.add(new Hospital(detail[3], detail[1], detail[5], detail[7], detail[10], detail[11], detail[12], detail[13], count));
			
		}
		list.remove(0);// 항목명 부분 삭제
//		for(Hospital a : list) {
//			System.out.println(a);
//		}
	}

	public void printHospitalData() {
		System.out.printf("%-10s %-20s %-10s %-10s %-30s %-10s %-30s %-10s %-4s\n", "종류", "병원명", "시도명", "시군구명", "주소",
				"전화번호", "홈페이지주소", "개설일", "총의사수");// 출력시 출력자리를 맞춰주기 위해 printf를 사용하였음.

		for (Hospital h : list) {
			
			System.out.printf("%-10s %-20s %-10s %-10s %-30s %-10s %-30s %-10s %-4d\n", h.getCategory(),
					h.getHospitalName(), h.getStateCode(), h.getCityCode(), h.getAddress(), h.getPhone(), h.getSite(),
					h.getOpenDate(), h.getDoctorCount());

		}
	}

}
