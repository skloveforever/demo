package com.example.demo.controller;

import com.example.demo.entity.DemoEntity;
import com.example.demo.service.DemoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private final DemoService service;

    public DemoController(DemoService service) {
        this.service = service;
    }

    @PostMapping
    public DemoEntity addData(@RequestBody DemoEntity entity) {
        return service.save(entity);
    }

    @GetMapping
    public List<DemoEntity> getAll() {
        return service.getAll();
    }
}
