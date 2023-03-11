package random;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 随机数游戏类
 * 
 * @author Jiancai Zhong
 * @date 2023年3月12日
 *
 */
public class RandomGames {
	private static final Logger log = LoggerFactory.getLogger(RandomGames.class);

	public static void main(String[] args) {
		randomGames();
	}

	/**
	 * 随机数游戏类，猜1-100的随机数
	 */
	public static void randomGames() {
		Integer randomInt = RandomUtils.getIntegerRandom(100) + 1;

		// log.debug("随机数是：{}", randomInt);

		Boolean isTrue = false;
		while (!isTrue) {
			System.out.println("请输入随机数:");
			Scanner sc = new Scanner(System.in);
			int guessInt = sc.nextInt();
			if (guessInt == randomInt) {
				isTrue = true;
				sc.close();
			} else {
				if (guessInt > randomInt) {
					log.info("猜大了！");
				} else {
					log.info("猜小了！");
				}
			}
		}

		log.info("恭喜你，猜中了！");
	}

}
