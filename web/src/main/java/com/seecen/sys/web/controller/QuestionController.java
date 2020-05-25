package com.seecen.sys.web.controller;


import com.seecen.sys.common.model.Question;

import com.seecen.sys.web.service.IExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuestionController {
    @Autowired
    private IExamService examService;
    @PostMapping("/exam/question/add.do")
    public String add(@RequestBody Question question){
        System.out.println(question);
        return examService.add(question);

    }
    //@PathVariable 用于/exam/question/page/{}/{}.do
    //@RequestParam 可以不写，写了可以设置一些默认参数与是否能不能传空值 required = false
    @GetMapping(value="/exam/question/page.do")
    public String pages(@RequestParam(value = "pageNum",defaultValue = "1",required = false) int pageNum,
                        @RequestParam(value = "pageSize",defaultValue = "2",required = false) int pageSize,
                        Question question){
        System.out.println(question);
                return examService.pages(pageNum,pageSize,question);
        }
    }
