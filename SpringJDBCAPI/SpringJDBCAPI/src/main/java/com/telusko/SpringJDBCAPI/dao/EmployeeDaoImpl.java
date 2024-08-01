package com.telusko.SpringJDBCAPI.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements IEmployeePersistency {

	@Autowired
	DataSource dataSource;
	private String SQL_QUERY="SELECT * from employee";
	private PreparedStatement pstmt;
	private ResultSet rs;
	ArrayList<Employee> list;
	
	@Override
	public ArrayList<Employee> getEmployees() {
		
		try {
			Connection connection = dataSource.getConnection();
			System.out.println("Coonection name from hikari==>"+connection.getClass().getName());
			pstmt=connection.prepareStatement(SQL_QUERY);
			rs=pstmt.executeQuery();
			list=new ArrayList<>();
			while(rs.next()) {
				
				list.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}

	
}
