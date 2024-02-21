package com.yunxiao.service;

import com.yunxiao.entity.Announcement;

import java.util.List;
//通知公告接口
public interface IAnnouncementService {
    // 查看通知
    List<Announcement> viewAnnouncements();
    // 发布公告
    void postAnnouncements(Announcement announcement);
}
