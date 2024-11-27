package com.human.notice.vo;

import org.springframework.stereotype.Component;

@Component
public class NoticeVO {
    private String n_idx;
    private String n_category;
    private String n_title;
    private String n_content;
    private String n_regdate;
    private String n_update;
    private String n_status;


    public NoticeVO() {
    }

    public String getN_idx() {
        return n_idx;
    }

    public void setN_idx(String n_idx) {
        this.n_idx = n_idx;
    }

    public String getN_category() {
        return n_category;
    }

    public void setN_category(String n_category) {
        this.n_category = n_category;
    }

    public String getN_title() {
        return n_title;
    }

    public void setN_title(String n_title) {
        this.n_title = n_title;
    }

    public String getN_content() {
        return n_content;
    }

    public void setN_content(String n_content) {
        this.n_content = n_content;
    }

    public String getN_regdate() {
        return n_regdate;
    }

    public void setN_regdate(String n_regdate) {
        this.n_regdate = n_regdate;
    }

    public String getN_update() {
        return n_update;
    }

    public void setN_update(String n_update) {
        this.n_update = n_update;
    }

    public String getN_status() {
        return n_status;
    }

    public void setN_status(String n_status) {
        this.n_status = n_status;
    }
}
