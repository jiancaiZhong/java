package random;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomUtilsTest extends RandomUtils {
	private static final Logger log = LoggerFactory.getLogger(RandomUtilsTest.class);

	/**
	 * 测试获取随机整数
	 */
	@Test
	public void testGetIntegerRandom() {
		Integer integerRandom = getIntegerRandom(10);
		log.debug("integerRandom ==> {}", integerRandom);
	}

}
