package com.seecen.sys.web.controller;

import com.seecen.sys.common.model.Dict;
import com.seecen.sys.web.service.IExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DictController {
    @Autowired
    private IExamService examService;
    @GetMapping("/exam/dict/{type}.do")
    public List<Dict> qureyDictType(@PathVariable("type") String type){
        return examService.qureyDictType(type);
    }
}
