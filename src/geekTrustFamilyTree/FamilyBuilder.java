package geekTrustFamilyTree;

import java.util.ArrayList;
import java.util.HashMap;

public class FamilyBuilder {

	private static int id = 1;
	private static int memberOrder = 1;

	public static Family familyBuilder() {
		Family family = new Family("F"+id);
		id++;
		return family;
	}

	public static Family buildShanFamily() {
		Family family = familyBuilder();
		Person person1 = new Person("King Shan", Gender.MALE);
		Person person2 = new Person("Queen Anga", Gender.FEMALE);
		family.getParentNodes()[0] = person1;
		family.getParentNodes()[1] = person2;
		family.getMemberOrder().put(person1, memberOrder++);
		family.getMemberOrder().put(person2, memberOrder++);
		family.getMembers().add(person1);
		family.getMembers().add(person2);
		HashMap<Relationship, ArrayList<Person>> hm;
		if((hm = family.getRelateMem().get(person1)) == null) {
			hm = new HashMap<>();
			ArrayList<Person> p1 = new ArrayList<>();
			p1.add(person2);
			hm.put(Relationship.Husband, p1);
		}
		if((hm = family.getRelateMem().get(person2)) == null) {
			hm = new HashMap<>();
			ArrayList<Person> p2 = new ArrayList<>();
			p2.add(person1);
			hm.put(Relationship.Wife, p2);
		}
		return family;
	}

	public static void addMember(Family family, Person child, Person mother) {
		family.getMembers().contains(mother);
		family.getMemberOrder().put(child, memberOrder++);
		family.getMembers().add(child);
		HashMap<Relationship, ArrayList<Person>> hm = null;
		if((hm = family.getRelateMem().get(mother)) == null) {
			hm = new HashMap<>();
			ArrayList<Person> p1 = new ArrayList<>();
			p1.add(child);
			hm.put(Relationship.Mother, p1);
		} else {
			ArrayList<Person> p1 = new ArrayList<>();
			if((p1 = hm.get(Relationship.Mother)) == null)
				p1 = new ArrayList<>();
			p1.add(child);
			if((p1 = hm.get(Relationship.Wife)) != null) {
				p1.forEach(p -> {
					Person father = p;
					HashMap<Relationship, ArrayList<Person>> hm1 = null;
					if((hm1 = family.getRelateMem().get(father)) == null) {
						hm1 = new HashMap<>();
						ArrayList<Person> p2 = new ArrayList<>();
						p2.add(child);
						hm1.put(Relationship.Father, p2);
					} else {
						ArrayList<Person> p2 = new ArrayList<>();
						if((p2 = hm1.get(Relationship.Father)) == null)
							p2 = new ArrayList<>();
						p2.add(child);
					}
				});
			}
		}
		if(child.getGender().equals(Gender.MALE))
			family.getRelationships().add(Relationship.Son);
		else
			family.getRelationships().add(Relationship.Daughter);
	}

	private static Family buildFirstLevel(Family family) {
		Person person1 = new Person("Chit", Gender.MALE);
		Person mother = new Person("Queen Anga", Gender.FEMALE);
		addMember(family, person1, mother);
		Person person2 = new Person("Amba", Gender.FEMALE);
		family.getMemberOrder().put(person1, memberOrder++);
		family.getMemberOrder().put(person2, memberOrder++);
		family.getMembers().add(person1);
		family.getMembers().add(person2);
		HashMap<Relationship, ArrayList<Person>> hm;
		if((hm = family.getRelateMem().get(person1)) == null) {
			hm = new HashMap<>();
			ArrayList<Person> p1 = new ArrayList<>();
			p1.add(person2);
			hm.put(Relationship.Husband, p1);
		}
		if((hm = family.getRelateMem().get(person2)) == null) {
			hm = new HashMap<>();
			ArrayList<Person> p2 = new ArrayList<>();
			p2.add(person1);
			hm.put(Relationship.Wife, p2);
		}

		Person person3 = new Person("Ish", Gender.MALE);
		addMember(family, person3, mother);
		family.getMemberOrder().put(person3, memberOrder++);
		family.getMembers().add(person3);

		Person person4 = new Person("Vich", Gender.MALE);
		addMember(family, person4, mother);
		Person person5 = new Person("Lika", Gender.FEMALE);
		family.getMemberOrder().put(person4, memberOrder++);
		family.getMemberOrder().put(person5, memberOrder++);
		family.getMembers().add(person4);
		family.getMembers().add(person5);
		HashMap<Relationship, ArrayList<Person>> hm1;
		if((hm1 = family.getRelateMem().get(person4)) == null) {
			hm1 = new HashMap<>();
			ArrayList<Person> p1 = new ArrayList<>();
			p1.add(person5);
			hm1.put(Relationship.Husband, p1);
		}
		if((hm1 = family.getRelateMem().get(person5)) == null) {
			hm1 = new HashMap<>();
			ArrayList<Person> p2 = new ArrayList<>();
			p2.add(person4);
			hm1.put(Relationship.Wife, p2);
		}
		
		Person person6 = new Person("Aras", Gender.MALE);
		addMember(family, person6, mother);
		Person person7 = new Person("Chitra", Gender.FEMALE);
		family.getMemberOrder().put(person6, memberOrder++);
		family.getMemberOrder().put(person7, memberOrder++);
		family.getMembers().add(person6);
		family.getMembers().add(person7);
		HashMap<Relationship, ArrayList<Person>> hm2;
		if((hm2 = family.getRelateMem().get(person6)) == null) {
			hm2 = new HashMap<>();
			ArrayList<Person> p1 = new ArrayList<>();
			p1.add(person7);
			hm2.put(Relationship.Husband, p1);
		}
		if((hm2 = family.getRelateMem().get(person7)) == null) {
			hm2 = new HashMap<>();
			ArrayList<Person> p2 = new ArrayList<>();
			p2.add(person6);
			hm2.put(Relationship.Wife, p2);
		}
		
		Person person8 = new Person("Vyan", Gender.MALE);
		Person person9 = new Person("Chitra", Gender.FEMALE);
		addMember(family, person9, mother);
		family.getMemberOrder().put(person9, memberOrder++);
		family.getMemberOrder().put(person8, memberOrder++);
		family.getMembers().add(person9);
		family.getMembers().add(person8);
		HashMap<Relationship, ArrayList<Person>> hm3;
		if((hm3 = family.getRelateMem().get(person8)) == null) {
			hm3 = new HashMap<>();
			ArrayList<Person> p1 = new ArrayList<>();
			p1.add(person9);
			hm3.put(Relationship.Husband, p1);
		}
		if((hm3 = family.getRelateMem().get(person9)) == null) {
			hm3 = new HashMap<>();
			ArrayList<Person> p2 = new ArrayList<>();
			p2.add(person8);
			hm3.put(Relationship.Wife, p2);
		}

		return family;
	}

}
