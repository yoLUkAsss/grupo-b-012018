package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import builders.UserBuilder;
import util.Password;

public class UserTest {
	
	@Test
	public void testWhenICreateANewUserThenItHasAProfile(){
		User newUser = new User();
		
		assertTrue(newUser.getProfile() != null);
	}
	
	@Test
	public void testWhenICreateANewUserWithANameAMailAPasswordAndAnAddressThenItHasAllTheseFieldsSet(){
		UserBuilder newUserBuilder = new UserBuilder();
		User okUser = newUserBuilder
				.withUsername("someName")
				.withEmail("someEmail")
				.withPassword(new Password("somePassword"))
				.build();
		assertEquals(okUser.getUsername(), "someName");
		assertEquals(okUser.getEmail(), "someEmail");
		assertEquals(okUser.getPassword().getPassword(), new Password("somePassword").getPassword());
	}
}
