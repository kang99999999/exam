package com.human.notice.service;

import com.human.notice.vo.NoticeVO;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface NoticeService {
    List<NoticeVO> noticeList() throws DataAccessException;
}