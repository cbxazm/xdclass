package com.cbx.xdvideo.mapper;

import com.cbx.xdvideo.domain.Video;
import com.cbx.xdvideo.provider.VideoProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface VideoMapper {
    @Select("select * from video")
    List<Video> findAll();
    @Select("select * from video where id=#{id}")
     Video findById(int id);
//    @Update("update video set title=#{title} where id=#{id}")
    @UpdateProvider(type = VideoProvider.class,method = "updateVideo")
    int update(Video video);
    @Delete("delete from video where id=#{id}")
     int delete(Integer id);
    @Insert("insert into video (title,summary,cover_img,view_num,price,create_time,online,point) values" +
            "(#{title},#{summary},#{coverImg},#{viewNum},#{price},#{createTime},#{online},#{point})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    int save(Video video);
}
