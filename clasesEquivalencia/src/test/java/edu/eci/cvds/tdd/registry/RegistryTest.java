package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("Rativa",100,19,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

	@Test
	public void mustValidateRegistryResultUnderage() {

        Person person = new Person("Ospina",101,16,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);
		 
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
	
	@Test
	public void mustValidateRegistryResultInvalidAge() {

        Person person = new Person("Medina",102,-2,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);
		
        Assert.assertEquals(RegisterResult.INVALID_AGE, result); 
    }
	
	@Test
	public void mustValidateRegistryResultInvalidAge2() {

        Person person = new Person("Eduardo",103,111,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);
		
        Assert.assertEquals(RegisterResult.INVALID_AGE, result); 
    }
	
	@Test
	public void mustValidateRegistryResultDead() {

        Person person = new Person("Deivid",104,19,Gender.MALE,false);

        RegisterResult result = registry.registerVoter(person);
		
        Assert.assertEquals(RegisterResult.DEAD, result); 
    }
	
	@Test
	public void mustValidateRegistryResultDuplicated() {

        Person person = new Person("Mejia",105,19,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);
        
        Person person2 = new Person("Sebastian",105,19,Gender.MALE,true);
        
        RegisterResult result2 = registry.registerVoter(person2);
		
        Assert.assertEquals(RegisterResult.DUPLICATED, result2); 
    }
}