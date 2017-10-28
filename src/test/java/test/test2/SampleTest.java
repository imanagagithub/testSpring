package test.test2;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.domain.TestBean;
import com.mapper.TestMapper;

public class SampleTest {

	@Autowired
	TestMapper testMapper;

	@Test
	public void testng() throws Exception {

		// json模擬作成テスト
		TestBean testBean = new test.Test().createJson(new TestBean());

		String json = "test";
		// json編集
		new test.Test().createJsonFile(this.getClass(), new File(""), new Object() {
		}, json);
	}

}
