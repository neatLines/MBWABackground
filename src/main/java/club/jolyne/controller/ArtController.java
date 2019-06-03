package club.jolyne.controller;

import club.jolyne.models.PackageEntity;
import club.jolyne.repository.ArtRepository;
import club.jolyne.util.Pack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArtController {
    @Autowired
    private ArtRepository artRepository;


    @RequestMapping(value = "/art/{id}", method = RequestMethod.GET)
    @ResponseBody
    public PackageEntity allComment(@PathVariable int id) {
        return Pack.pack(artRepository.findOne(id), "success");
    }
}
