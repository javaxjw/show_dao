package cn.jugame.showList_web;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cn.jugame.showList_web.bean.Person;

@Repository
public class jdbcTest {
	@Autowired
	private JdbcTemplate template;
	
	public void save(){
		String sql="insert into jdbc_test(name,pass) values(?,?)";
		template.update(sql, new Object[] {"wenwen" , "chichi"});
	}
	
	public void query(){
		String sql="select * from jdbc_test";
		List<Map<String,Object>> list = template.queryForList(sql);
		System.out.println(list);
	}
	
	public void queryO(){
		String sql="select * from jdbc_test";
		List<Person> listO = template.query(sql, new RowMapper<Person>() {
			@Override
			public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
				Person p = new Person();
				p.setName(rs.getString(2));
				p.setPass(rs.getString(3));
				return p;
			}
		});
		Iterator<Person> i = listO.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
	
	
	public void setTemplate(JdbcTemplate template){
		this.template = template;
	}
}
