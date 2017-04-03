package com.ruihu;

import com.ruihu.web.i18n.I18NService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SsBpayApplicationTests {
	@Autowired
	private I18NService i18NService;

	@Test
	public void contextLoads() {
		String e ="s";
		String o="2";
		String ww = i18NService.getMessage(o);
		Assert.assertEquals("",e,ww);
	}

}
