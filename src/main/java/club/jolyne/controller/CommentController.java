package club.jolyne.controller;

import club.jolyne.models.CommentEntity;
import club.jolyne.models.ExhiEntity;
import club.jolyne.models.PackageEntity;
import club.jolyne.models.UserEntity;
import club.jolyne.repository.CommentRepository;
import club.jolyne.util.Pack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @RequestMapping(value = "/comment/Comment/{id}", method = RequestMethod.GET)
    @ResponseBody
    public PackageEntity allComment(@PathVariable int id) {
        ExhiEntity exhiEntity = new ExhiEntity();
        exhiEntity.setExhibitid(id);
        List<CommentEntity> entities = commentRepository.findByExhiByExhiId(exhiEntity);
        return dateProcess(entities);
    }

    @RequestMapping(value = "/comment/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public PackageEntity mineComment(@PathVariable int id) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        List<CommentEntity> entities = commentRepository.findByUserByUserId(userEntity);
        return dateProcess(entities);
    }

    @RequestMapping(value = "/comment/publish", method = RequestMethod.POST)
    @ResponseBody
    public PackageEntity publish(@RequestBody CommentEntity commentEntity) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(commentEntity.getUserId());
        commentEntity.setUserByUserId(userEntity);
        ExhiEntity exhiEntity = new ExhiEntity();
        exhiEntity.setExhibitid(commentEntity.getExhiId());
        commentEntity.setExhiByExhiId(exhiEntity);
        commentRepository.saveAndFlush(commentEntity);
        return Pack.pack("", "success");

    }

    private PackageEntity dateProcess(List<CommentEntity> entities) {
        if (entities.isEmpty()) {
            return Pack.pack(entities, "no response");
        }
        entities.forEach(e -> {
            e.setUserId(e.getUserByUserId().getId());
            e.setExhiId(e.getExhiByExhiId().getExhibitid());
            e.setUsername(e.getUserByUserId().getUsername());
            e.setExhiName(e.getExhiByExhiId().getName());
        });
        return Pack.pack(entities, "success");
    }
}
