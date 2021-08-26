package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
	private ArrayList<Person> personRegistry = new ArrayList<Person>();
    public RegisterResult registerVoter(Person p) {
    	if(p.getAge() < 18 && p.getAge() >= 0) {
    		return RegisterResult.UNDERAGE;
    	}
    	else if(p.getAge() < 0 && p.getAge() >= 110) {
    		return RegisterResult.INVALID_AGE;
    	}
    	else if(p.isAlive() == false) {
    		return RegisterResult.DEAD;
    	}
		for(Person per: personRegistry){
			if(p.getId() == per.getId()){
				return RegisterResult.DUPLICATED;
			}
		}
        return RegisterResult.VALID;
        
    }
}