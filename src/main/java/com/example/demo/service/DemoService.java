package com.example.demo.service;

import com.example.demo.entity.DemoEntity;
import com.example.demo.repository.DemoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    private final DemoRepository repository;

    public DemoService(DemoRepository repository) {
        this.repository = repository;
    }

    public DemoEntity save(DemoEntity entity) {
        return repository.save(entity);
    }

    public List<DemoEntity> getAll() {
        return repository.findAll();
    }
}
