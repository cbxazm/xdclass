package com.cbx.xdvideo.service;

import com.cbx.xdvideo.domain.Video;

import java.util.List;

public interface VideoService {
    List<Video> findAll();
    Video findById(int id);
    int update(Video video);
    int delete(Integer id);
    int save(Video video);
}
