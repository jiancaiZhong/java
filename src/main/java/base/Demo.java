package base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @Description: demo
 * @author Jiancai Zhong
 * @date 2023年3月11日
 *
 */
public class Demo {
	private static final Logger log = LoggerFactory.getLogger(Demo.class);

	public static void main(String[] args) {
		String name = "zjc";
		log.debug("hello, ==> {}", name);
	}

}
