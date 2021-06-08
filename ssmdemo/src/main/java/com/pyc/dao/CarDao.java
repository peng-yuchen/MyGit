package com.pyc.dao;

import com.pyc.bean.Car;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarDao extends SqlSessionDaoSupport {
    //为了让mybatis实现jdbc，我门应该问spring要sqlSessionFactory交给SqlSessionDaoSupport
    //现在父类需要一个sqlSessionFactory
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }
    public void save(Car car){
        //问父类要session
        SqlSession sqlSession = super.getSqlSession();
        //下面的参数是namespace+id
        sqlSession.insert("com.pyc.bean.Car.save",car);
    }
}
