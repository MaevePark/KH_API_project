package kh.java.data.corona19;

//import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
//import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import kh.java.data.corona19.model.vo.Corona19Info;

public class ApiExplorer {
	public static void main(String[] args) { // throw 로 묶으면 절대 오류 못보니 삭제
		// 교재 92~98p 실습 예제. 교재랑 문제가 다름(교재 옛날 API)
		// 이 문서는 자바애플리케이션을 실행하는 클래스로 main메소드가 있고, 내부에 run(), parseXML()매소드를 가지고 있다.
		// 문서 제목 : 보건복지부 코로나19 시도 발생현황
		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/1352000/ODMS_COVID_04/callCovid04Api"); /* URL */
		String key = "gV3xuX54xHjnGeMnune8oCity6Ezo%2BJtOhZ1lbfYTpST4QNIh401y7ylmY%2BqiY45T5snfkiVFvICNh%2BBs6NDgg%3D%3D";

		// try ~ catch 문까지 함
		try {
			// 1. url 생성
			urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + key); /* Service Key */
			urlBuilder.append(
					"&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지번호 */
			urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
					+ URLEncoder.encode("500", "UTF-8")); /* 한 페이지 결과 수 */
			urlBuilder.append("&" + URLEncoder.encode("apiType", "UTF-8") + "="
					+ URLEncoder.encode("xml", "UTF-8")); /* 결과형식(xml/json) */
			urlBuilder.append("&" + URLEncoder.encode("std_day", "UTF-8") + "="
					+ URLEncoder.encode("2021-12-15", "UTF-8")); /* 기준일자 */
			// urlBuilder.append("&" + URLEncoder.encode("gubun","UTF-8") + "=" +
			// URLEncoder.encode("경기", "UTF-8")); /*시도명*/

			// 2. url로 연결
			URL url = new URL(urlBuilder.toString());
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			System.out.println("Response code: " + conn.getResponseCode());

			// 3. 연결 Stream으로 부터 읽기

			// 방법 1 - Stream으로 부터 읽은 것
			/*
			 * BufferedReader rd; if(conn.getResponseCode() >= 200 && conn.getResponseCode()
			 * <= 300) { rd = new BufferedReader(new
			 * InputStreamReader(conn.getInputStream())); } else { rd = new
			 * BufferedReader(new InputStreamReader(conn.getErrorStream())); } StringBuilder
			 * sb = new StringBuilder(); String line; while ((line = rd.readLine()) != null)
			 * { sb.append(line); } System.out.println(sb.toString()); rd.close();
			 */

			// 방법 2 - Stream으로 부터 읽은 것을 class에다가 넣기
			// Stream --> inputstream --> Document 형태 --> XML 로 다룰 수 있음
			Document doc = new ApiExplorer().parseXML(conn.getInputStream());
			NodeList list = doc.getElementsByTagName("item");
			// XML에 <itme>에서 꺼낼 값(=Element , 여러개면 Elements)
			doc.getElementsByTagName("item"); // TagName item 에서 elements
			System.out.println(list.getLength());
			System.out.println(list.item(0));

			// **아주중요 ArrayList
			List<Corona19Info> volisList = new ArrayList<Corona19Info>();
			for (int i = 0; i < list.getLength(); i++) {

				// list. item(i)의 결과를 변수명 item 에 담아주세요.
				Node item = list.item(i);

				// nullPointException 은 . 앞에 null 이어서 오류 발생
				Node n = item.getFirstChild();

				Corona19Info vo = new Corona19Info();

				while (n != null) {
					String nodeName = n.getNodeName();
					String nodeText = n.getTextContent();
					try {
						switch (nodeName) {
						case "deathCnt":
							vo.setDeathCnt(Long.parseLong(nodeText));
							break;
						case "defCnt":
							vo.setDefCnt(Long.parseLong(nodeText));
							break;
						case "gubun":
							vo.setGubun(nodeText);
							break;
						case "gubunCn":
							vo.setGubunCn(nodeText);
							break;
						case "gubunEn":
							vo.setGubunEn(nodeText);
							break;
						case "incDec":
							vo.setIncDec(Long.parseLong(nodeText));
							break;
						case "isolClearCnt":
							vo.setIsolClearCnt(Long.parseLong(nodeText));
							break;
						case "isolIngCnt":
							vo.setIsolIngCnt(Long.parseLong(nodeText));
							break;
						case "localOccCnt":
							vo.setGubunEn(nodeText);
							break;
						case "overFlowCnt":
							vo.setOverFlowCnt(Long.parseLong(nodeText));
							break;
						case "qurRate":
							vo.setQurRate(Long.parseLong(nodeText));
							break;
						case "stdDay":
							vo.setStdDay(nodeText);
							break;
						}
					} catch (Exception e) {
						e.printStackTrace();
					}

//	        		if(nodeName.equals("deathCnt"))
//        				vo.setDeathCnt(Long.parseLong(nodeText));
//        			else if(nodeName.equals("defCnt"))
//        				vo.setDefCnt(Long.parseLong(nodeText));
//        			else if(nodeName.equals("gubun"))
//        				vo.setGubun(nodeText);
//        			else if(nodeName.equals("gubunCn"))
//        				vo.setGubunCn(nodeText);
//        			else if(nodeName.equals("gubunEn"))
//        				vo.setGubunEn(nodeText);
//        			else if(nodeName.equals("incDec"))
//        				vo.setIncDec(Long.parseLong(nodeText));
//        			else if(nodeName.equals("isolClearCnt"))
//        				vo.setIsolClearCnt(Long.parseLong(nodeText));
//        			else if(nodeName.equals("isolIngCnt"))
//        				vo.setIsolIngCnt(Long.parseLong(nodeText));

//		        vo.setDeathCnt(48);
//		        vo.setDefCnt(21179);

//	        		System.out.println(n.getNodeName());
//	        		System.out.println(n.getTextContent());
					n = n.getNextSibling();
				}

				

//	        	vo.setDeathCnt(48);
//	        	vo.setDeathCnt(21179);
//	        	volisList.add(vo);	        	
			}

			for (Corona19Info vo : volisList) {
				System.out.println(vo);
			}

			List<String> listStr = new ArrayList<String>();
			listStr.add("수박");
			listStr.add("수박");
			listStr.add("수박");


			for (int i = 0; i < listStr.size(); i++) {
				System.out.println(listStr.get(i));

			}

//	        Corona19info vo2 = new Corona19info();
//	        vo.setDeathCnt(48);
//	        vo.setDeathCnt(21179);
//	        volisList.add(vo2);
//	        
//	        Corona19info vo3 = new Corona19info();
//	        vo.setDeathCnt(48);
//	        vo.setDeathCnt(21179);
//	        volisList.add(vo3);
//	        

			conn.disconnect();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 기본자세 - 메소드를 정의하고 나서 할일
	// return 타입이 뭔지 확인 void 가 아니면 return을 써야함, 두줄 꼭 기억 하고 가운데 채우기
	// Document result = null;
	// return result;

	// InputStream 형태의 객체를 주면 Document 로 바꿔준다는 내용
	private Document parseXML(InputStream stream) {
		DocumentBuilderFactory objDocumentBuilderFactory = null;
		DocumentBuilder obDocumentBuilder = null;
		Document result = null;

		// java xml 파싱 빌드업 코드 2줄

		try {
			objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
			obDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();
			result = obDocumentBuilder.parse(stream);

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) { // Simple API for XML
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

}
