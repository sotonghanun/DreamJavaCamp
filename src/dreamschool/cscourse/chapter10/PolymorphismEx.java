package dreamschool.cscourse.chapter10;

public class PolymorphismEx {

	public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person("홍길동", "111-2222");
		persons[1] = new Student("홍길순", "111-2345", "컴퓨터공학과");
		persons[2] = new Teacher("강감찬", "222-3333", "Java");
		
		for(int i = 0; i < persons.length; i++) {
			if(persons[i] instanceof Student) {
				((Student)persons[i]).study();
			} else if(persons[i] instanceof Teacher) {
				((Teacher)persons[i]).teach();
			}
			persons[i].eat();
			persons[i].sleep();
			System.out.println();
		}
		
		for(Person p : persons) {
			p.eat();
			p.sleep();
			System.out.println();
		}
		
		((Student)persons[1]).study();
		Student s1 = (Student)persons[1];
		s1.study();


	}

}
