package com.human.notice.repository;

import com.human.notice.vo.NoticeVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("noticeDAO")
public class NoticeDAOImpl implements NoticeDAO {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<NoticeVO> selectNoticeList() throws DataAccessException {
        List<NoticeVO> noticeList = sqlSession.selectList("mapper.notice.selectNoticeList");
        return noticeList;
    }
}