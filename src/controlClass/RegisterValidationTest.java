package controlClass;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * @title:LoginValidationTest.java
 * @author group63
 * @version V4.3
 * @description:Test class: test the LoginValidationTest.java .
 */
class RegisterValidationTest {

	@Test
	 public void registerTest() {
		RegisterValidation test1=new RegisterValidation();
		assertEquals(true,test1.validation("zhang", "zhang", "zh@126.com", "13378998732", "yyy","yyy"));
		assertEquals(false,test1.validation("123", "zhang", "zh@126.com", "13378998732", "yyy","yyq"));//wrong name input
		assertEquals(false,test1.validation("zhang", "zhang", "zh26.com", "13378998732", "yyy","yyq"));//wrong email input
		assertEquals(false,test1.validation("zhang", "zhang", "zh@126.com", "1337899873", "yyy","yyy"));//wrong phone input
		assertEquals(false,test1.validation("zhang", "zhang", "zh@126.com", "13378998732", "123","yyy"));//wrong password input
		assertEquals(false,test1.validation("zhang", "zhang", "zh@126.com", "13378998732", "yyy","qqq"));//different password
		
	}

}
