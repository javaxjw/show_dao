package cn.jugame.showList_web.dao.update.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import cn.jugame.showList_web.bean.Game;
import cn.jugame.showList_web.dao.IUpdateGame;

@Repository(value="UpdateGame")
public class UpdateGame implements IUpdateGame{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int increatGame(Game game) {
		System.out.println(jdbcTemplate);
		String sql="insert into game1(game_info,game_name,game_pic) values(?,?,?)";
		int result = jdbcTemplate.update(sql, new Object[]{game.getGameInfo(), game.getGameName(), game.getGamePic()});
		return result;
	}
	
	@Override
	public int updateGameName( final Game game, final String gameName) {
		String sql = "update game1 set game_name = ? where game_id = ?";
		int result = jdbcTemplate.update(sql, new PreparedStatementSetter(){
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, gameName);
				ps.setString(2, game.getGameId());
			}
		});
		return result;
	}
	
	@Override
	public int deleteGame(Game game) {
		String sql = "delete game where game_id = ?";
		int result = jdbcTemplate.update(sql, new Object[]{game.getGameId()});
		return result;
	}
	
}
