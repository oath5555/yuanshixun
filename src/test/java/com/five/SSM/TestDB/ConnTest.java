package com.five.SSM.TestDB;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.jasper.tagplugins.jstl.core.Out;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration("classpath:applicationContext-bean.xml") 
public class ConnTest {
	
	@Autowired  
    private SqlSessionFactory sqlSessionFactory;
	
	@Test  
    public void testConn() {  
        Connection con = sqlSessionFactory.openSession().getConnection();
        try {
			Statement statement = con.createStatement();
			String sql = "select * from user";
			ResultSet rs = statement.executeQuery(sql); 
			while(rs.next()) {  
				System.out.println("姓名："+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        assertNotNull("数据库连接失败!!!", con);  
    }  

}
