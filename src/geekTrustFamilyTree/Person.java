package geekTrustFamilyTree;

public class Person {
	private String name;
	private Gender gender;
	
	public Person(String name, Gender gender ) {
		this.name = name;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public Gender getGender() {
		return gender;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((Person)obj).getName().equalsIgnoreCase(name);
	}
}
