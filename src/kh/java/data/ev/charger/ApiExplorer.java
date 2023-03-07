package kh.java.data.ev.charger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

// 220907_3,4,5 교시 공공데이터 전기자동차 충전소 첫 연습_1 그대로 복사해오기
public class ApiExplorer {
	public static void main(String[] args) {
		// try { //String key = 만들어서 복붙하고 / Service Key 부분에 key값으로 변경

		// 1.요청 URL 생성
		String key = "gV3xuX54xHjnGeMnune8oCity6Ezo%2BJtOhZ1lbfYTpST4QNIh401y7ylmY%2BqiY45T5snfkiVFvICNh%2BBs6NDgg%3D%3D";
		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/B552584/EvCharger/getChargerInfo"); /* URL */

		try { // 요청 parameter 부분
			urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + key); /* Service Key */
			// 또는 urlBuilder.append("?serviceKey=" + key); 로 줄일 수 있다 결과는 같다
			urlBuilder.append(
					"&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지번호 */
			// 또는 urlBuilder.append("&pageNo=1"); 로 줄일 수 있다 결과는 같다
			urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
					+ URLEncoder.encode("10", "UTF-8")); /* 한 페이지 결과 수 (최소 10, 최대 9999) */
			// 또는 urlBuilder.append("&numOfRows=10"); 로 줄일 수 있다 결과는 같다
			urlBuilder.append("&" + URLEncoder.encode("zcode", "UTF-8") + "="
					+ URLEncoder.encode("11", "UTF-8")); /* 시도 코드 (행정구역코드 앞 2자리) */
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		// 2. 위 URL 로 connection 단계
		URL url = null;
		HttpURLConnection conn = null;
		try {
			url = new URL(urlBuilder.toString());
			URLConnection uconn = url.openConnection();
			//conn = (HttpURLConnection) url.openConnection();
			if (uconn instanceof HttpURLConnection)
				conn = (HttpURLConnection) url.openConnection(); //다운그레이드
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			System.out.println("Response code: " + conn.getResponseCode()); // 200 번은 성공을 의미(getResponseCode)
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 3. 연결로 부터 요청의 응답 처리 단계
		BufferedReader rd = null;
		StringBuilder sb = null;
		try {

			if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) { // 200 번 성공, (400 번은 실패를 의미)
				rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			sb = new StringBuilder();
			String line = null;
			// while 문 2
//					while((line = rd.readLine()) != null) {
//						sb.append(line);
//					}

			// while 문 1
			while (true) {
				line = rd.readLine();
				if (line != null) {
					sb.append(line);
				} else {
					break;
				}
				// do - while 문
					do {
						line = rd.readLine();
						if(line !=null);{
							sb.append(line);
						}
					}while(line !=null);

				sb.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// rd.close(); 먼저 close 후에 conn.disconnect();
			try {
				if (rd != null)
					rd.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			conn.disconnect();
		}
//				rd.close();
//				conn.disconnect(); // 지우기
		// sb --> EvChargerInfo 클래스 모양으로 변경 내일
		System.out.println(sb.toString());
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
	}
}
