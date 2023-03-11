package random;

import java.util.Random;

/**
 * 
 * @Description: 随机数类
 * @author Jiancai Zhong
 * @date 2023年3月11日
 *
 */
public class RandomUtils {

	/**
	 * 生成随机数
	 * 
	 * @param bound 最大的随机数
	 * @return 0到 bound 之间（不包含bound）的整型随机数
	 */
	public Integer getIntegerRandom(Integer bound) {
		Random random = new Random();
		return random.nextInt(bound);

	}
}
