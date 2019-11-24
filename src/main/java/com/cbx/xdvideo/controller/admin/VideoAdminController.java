package com.cbx.xdvideo.controller.admin;

import com.cbx.xdvideo.domain.Video;
import com.cbx.xdvideo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 管理员权限操作的
 */
@RestController
@RequestMapping("/admin/api/v1/video")
public class VideoAdminController {
    @Autowired
       private VideoService videoService;
     @DeleteMapping("/del_by_id")
    public int delById(@RequestParam(value = "video_id",required = true) int videoId){
        return videoService.delete(videoId);
    }
    @PutMapping("/update_by_id")
    public int update(@RequestBody Video video){
        return videoService.update(video);
    }
    @PostMapping("/save")
    public Object save(@RequestBody Video video){
        return videoService.save(video);
    }
}
