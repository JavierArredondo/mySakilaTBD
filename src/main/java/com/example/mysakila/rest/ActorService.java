package com.example.mysakila.rest;

import com.example.mysakila.Repositories.ActorRepository;
import com.example.mysakila.models.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorService {
    @Autowired
    private ActorRepository actorRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Actor> getAllActors()
    {
        return actorRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Actor getActor(@PathVariable Integer id)
    {
        Long actorId = id.longValue();
        return actorRepository.findActorById(actorId);
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Actor create(@RequestBody Actor resource) {
        return actorRepository.save(resource);
    }

}
