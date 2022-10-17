package entityClass;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @title:MemberTest.java
 * @author group63
 * @version V4.3
 * @description:A test class using TDD to test methods in membership class
 */


class MemberTest {

	@Test
	public void membershiptest() {
		Membership vip=new Membership("00000000", "zxc", "zhang", "san", "13398778932", "zhangsan@126.com");
        assertEquals("00000000",vip.getId());
        assertEquals("zxc",vip.getPassword());
        assertEquals("zhang",vip.getFirstname());
        assertEquals("san",vip.getSurname());
        assertEquals("13398778932",vip.getPhoneNo());
        assertEquals("zhangsan@126.com",vip.getEmail());
        
        
	}

}
