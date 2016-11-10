package cn.jugame.showList_web.dao.query.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cn.jugame.showList_web.bean.Game;
import cn.jugame.showList_web.dao.IQueryGame;

@Repository(value="QueryGameList")
public class QueryGameList implements IQueryGame{
	
	@Autowired
	private JdbcTemplate template;
	
	public List<Game> queryGameList() {
		
		String sql="select * from game ";
		List<Game> gameList = template.query(sql, new RowMapper<Game>(){
			@Override
			public Game mapRow(ResultSet rs, int rowNum) throws SQLException {
				Game g = new Game();
				g.setGameId(rs.getString(2));
				g.setGameName(rs.getString(3));
				g.setGameInfo(rs.getString(5));
				g.setGamePic(rs.getString(6));
				return g;
			}
		});
		
		
		
		return gameList;
	}
	
	@Override
	public int queryGameCount() {
		String sql = "select count(0) from game1";
		int result = template.queryForInt(sql);
		return result;
	}
	
	public void queryGame(){
		String sql = "select game_name from game1";
		List<String> list = template.queryForList(sql, String.class);
		Iterator<String> i = list.iterator();
		while(i.hasNext()){
			System.out.println(i.next()
					);
		}
	}
	}
