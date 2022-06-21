package _class;

class Person { 
	//class person 은 메뉴판으로 생각.
	//필드 (함수 안에 잡혀있으면 지역면수, 클래스 안에 잡혀있으면 필드라고함)
	private String name; // private을 추가하면 참조 불가능 상태로 만듬
	private int age;
	private String data;
	// 클래스만 생성

	// 메소드 
	public void setName(String n){ // string n을 받으면 name에 전달하겟다 == 구현;
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setData(String n, int a) {
		name = n;
		age = a;
	}
	public void setData() {} //Overload
	
	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
}
//--------------------------
public class PersonMain {

	public static void main(String[] args) {
		 
//		Person p; // p= 객체 O 변수 X (클래스변수 O)
//		Person p2; 
//		Person p3;
//		
		Person p = new Person();// 생성 // p2로 중복 생성도 가능.(메뉴판의 주인은 p, p2가 됨)
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		
		p.setName("홍길동"); //호출. get Name 함수에 넣었다고 다시 가지고 옴 return
		p.setAge(25);
		System.out.println("객체 p = " + p); 
		
		p2.setName("코난");
		p2.setAge(13);
		System.out.println("객체 p2 = "+p);
		
		//p.name = "홍길동";
		//p.age = 25;
		System.out.println(p.getName() + ", " + p.getAge());
		System.out.println(p2.getName() + ", " + p2.getAge());
		System.out.println();
		
		
		System.out.println("객체 p3 = " + p3);
		p3.setName("둘리");
		p3.setAge(15);
		System.out.println(p3.getName() + ", " + p.getAge() );
		// name =; ---> main 함수 안에서 객체를 찾기 때문에 에러남
		// p.name으로 클래스를 찾아주어야 한다. public은 open 햇는데 class 만 선언해도 ..?
		System.out.println();
		System.out.println("객체 p4 = " + p4);
		p4.setName("ff");
		p4.setAge(22);
		
		
	}

}
