package com.human.notice.repository;

import com.human.notice.vo.NoticeVO;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface NoticeDAO {

    /**
     * 공지사항 조회
     * @return
     * @throws DataAccessException
     */
    List<NoticeVO> selectNoticeList() throws DataAccessException;

}
