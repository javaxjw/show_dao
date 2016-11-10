package cn.jugame.showList_dao;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.jugame.showList_web.bean.Game;
import cn.jugame.showList_web.dao.query.impl.QueryGameList;

public class JunitTest {

	@Test
	public void testIncreatGame() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("/spring.xml");
		Object ug = ac.getBean("QueryGameList");
		QueryGameList ug1 = (QueryGameList)ug;
		Game g = new Game();
		g.setGameInfo("xxxxxx");
		g.setGameName("龙珠2世");
		g.setGamePic("http://www.baidu.com");
		ug1.queryGame();
	}

//	@Test
	public void testUpdateGameName() {
		
	}

//	@Test
	public void testDeleteGame() {
		fail("尚未实现");
	}

}
