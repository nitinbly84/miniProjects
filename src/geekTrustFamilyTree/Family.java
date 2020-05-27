package geekTrustFamilyTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Family {
	private String familyId;
	private HashMap<Person, HashMap<Relationship, ArrayList<Person>>> relateMem;
	private HashSet<Person> members;
	private HashSet<Relationship> relationships;
	private Person[] parentNodes;
	private LinkedHashMap<Person, Integer> memberOrder;
	
	public Family(String familyId) {
		this.familyId = familyId;
		relateMem = new HashMap<>();
		members = new HashSet<>();
		relationships = new HashSet<>();
		parentNodes = new Person[2];
		memberOrder = new LinkedHashMap<>();
	}

	public String getFamilyId() {
		return familyId;
	}

	public HashMap<Person, HashMap<Relationship, ArrayList<Person>>> getRelateMem() {
		return relateMem;
	}

	public HashSet<Person> getMembers() {
		return members;
	}

	public HashSet<Relationship> getRelationships() {
		return relationships;
	}

	public Person[] getParentNodes() {
		return parentNodes;
	}

	public LinkedHashMap<Person, Integer> getMemberOrder() {
		return memberOrder;
	}
	
}
