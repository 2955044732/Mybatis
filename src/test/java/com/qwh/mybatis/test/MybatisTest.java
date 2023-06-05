package com.qwh.mybatis.test;

import com.qwh.mybatis.mapper.UserMapper;
import com.qwh.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @auther qwh
 * @create 2023-04-2023/4/18 16:40
 */
public class MybatisTest {
    @Test
    public void Mybatisinsert() throws IOException {
        UserMapper mapper = getMapper();
        //测试功能
        int user = mapper.insertUser();
        System.out.println("user\t"+user);
    }

    private static UserMapper getMapper() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-conf.xml");
        //获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//true表示自动提交
        //获取mapper对象 代理模式
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper;
    }

    @Test
    public void Mybatisupdate() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-conf.xml");
        //获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//true表示自动提交
        //获取mapper对象 代理模式
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //测试功能
        boolean user = mapper.updateUser();
        System.out.println("user\t"+user);
    }
    @Test
    public void Mybatisdelete() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-conf.xml");
        //获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//true表示自动提交
        //获取mapper对象 代理模式
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //测试功能
        boolean user = mapper.deleteUser();
        System.out.println("user\t"+user);
    }
    @Test
    public void Mybatisselect() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-conf.xml");
        //获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//true表示自动提交
        //获取mapper对象 代理模式
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //测试功能
        User user = mapper.searchUser();
        System.out.println(user.toString());
    }
    @Test
    public void MybatisselectAllUser() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-conf.xml");
        //获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//true表示自动提交
        //获取mapper对象 代理模式
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //测试功能
        List<User> list = mapper.selectAllUser();
        for (User user : list) {
            System.out.println(user.toString());
        }
    }
}
