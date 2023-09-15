package core.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import core.chap2.Hotel;

public class Main {

	public static void main(String[] args) {
		
//		Hotel hotel = new Hotel();
//		hotel.inform();
//		직접 생성도 가능하다.
		
		// 빈 등록에 사용된 xml의 설정을 가져오는 객체를 생성. (classpath == src/main/resources)
		GenericXmlApplicationContext ct =
				new GenericXmlApplicationContext("classpath:Hotel-config.xml");
		
		Hotel hotel1 = ct.getBean("hotel1", Hotel.class); //얻고자하는 id, 타입
		hotel1.inform();
		
		System.out.println("====================================");
		
		Hotel hotel2 = ct.getBean("hotel2", Hotel.class);
		hotel2.inform();
		
		
		
	}

}
