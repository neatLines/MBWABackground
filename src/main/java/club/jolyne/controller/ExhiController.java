package club.jolyne.controller;

import club.jolyne.models.ArtEntity;
import club.jolyne.models.ExhiEntity;
import club.jolyne.models.PackageEntity;
import club.jolyne.repository.CommentRepository;
import club.jolyne.repository.ExhiRepository;
import club.jolyne.util.Pack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Controller
public class ExhiController {
    @Autowired
    private ExhiRepository exhiRepository;

    @Autowired
    private CommentRepository commentRepository;

    @RequestMapping(value = "/exhi", method = RequestMethod.GET)
    @ResponseBody
    public PackageEntity allExhi() {
        List<ExhiEntity> exhiEntities = exhiRepository.findAll();
        Collections.reverse(exhiEntities);
        return Pack.pack(exhiEntities, "success");
    }

    @RequestMapping(value = "/exhi/{id}", method = RequestMethod.GET)
    @ResponseBody
    public PackageEntity oneExhi(@PathVariable int id) {
        return Pack.pack(exhiRepository.findOne(id), "success");
    }

    @RequestMapping(value = "/exhi/exhibit/{id}", method = RequestMethod.GET)
    @ResponseBody
    public PackageEntity allArt(@PathVariable int id) {
        ExhiEntity exhiEntity = exhiRepository.findOne(id);
        if (null == exhiEntity) {
            return Pack.pack(null, "no response");
        }
        return Pack.pack(exhiEntity.getArtsByExhibitid(), "success");
    }
}
