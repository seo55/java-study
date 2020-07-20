package kr.ac.gachon.park;

public class Bus extends Car {
	@Override //이 method는 override인지 마킹 해줌 
	
	public void park() {
		System.out.println("버스를 주차했습니다");
	}
}
