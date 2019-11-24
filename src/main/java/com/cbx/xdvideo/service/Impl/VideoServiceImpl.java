package com.cbx.xdvideo.service.Impl;

import com.cbx.xdvideo.domain.Video;
import com.cbx.xdvideo.mapper.VideoMapper;
import com.cbx.xdvideo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoMapper videoMapper;
    @Override
    public List<Video> findAll() {
        return videoMapper.findAll();
    }

    @Override
    public Video findById(int id) {
        return videoMapper.findById(id);
    }

    @Override
    public int update(Video video) {
      return videoMapper.update(video);
    }

    @Override
    public int delete(Integer id) {
          return videoMapper.delete(id);
    }

    @Override
    public int save(Video video) {
        int rows = videoMapper.save(video);
        System.out.println(video.getId());
        System.out.println(video.getTitle());
        return rows;
    }
}
