package core.chap3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Setter;

@Setter
public class AsianRestaurant implements Restaurant {
	
//	@Autowired
//	@Qualifier("asianChef")
	private Chef chef;
	
	//요리 코스
//	@Autowired
//	@Qualifier("sushi") 필드에도 사용할 수 있지만 권장하진 않음.
	private Course course;
	
	@Autowired
	public AsianRestaurant(@Qualifier("asianChef")Chef chef,@Qualifier("sushi") Course course) {
		super();
		this.chef = chef;
		this.course = course;
	}
	
	
	//요리를 주문하는 기능
	public void order() {
		System.out.println("아시안 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();
	}



	
}
