package com.sjsu;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.mysql.jdbc.PreparedStatement;

public class QueryDao {

	private JdbcTemplate jdbcTemplate ;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(Employee e){
		//String query="Insert into EMPLOYEES values("+e.getId()+",'"+e.getName()+"','"+e.getAddress()+"')";
		String query="Insert into EMPLOYEES values(?,?,?)";
		
		System.out.println(query);
		jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>() {
//			public Boolean doInPreparedStatement(PreparedStatement ps){
//				ps.setInt(0, 12);
//				ps.setString(1, "Rahul");
//				ps.setString(2, "Jhansi");
//				return ps.execute();
//			}

			@Override
			public Boolean doInPreparedStatement(java.sql.PreparedStatement ps)
					throws SQLException, DataAccessException {
				ps.setInt(0, 12);
				ps.setString(1, "Rahul");
				ps.setString(2, "Jhansi");
				return ps.execute();
			}
			
		});
	}
	public void delete(Employee e){
		String query="delete from EMPLOYEES where ID="+e.getId();
		jdbcTemplate.execute(query);
	}


	public static void main(String[] args) {
		

	}

}
