package com.seecen.sys.web.service;



import com.seecen.sys.common.model.Dict;
import com.seecen.sys.common.model.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "EXAM")
public interface IExamService {
    @PutMapping(value = "/exam/question/add.do",consumes = "application/json")
    String add(Question question);
    @GetMapping("/exam/dict/{type}.do")
    List<Dict> qureyDictType(@PathVariable("type") String type);
    //GetMapping 不能用@RequestBody
    @PostMapping(value="/exam/question/page/{pageNum}/{pageSize}.do",consumes = "application/json")
    String pages(@PathVariable(value = "pageNum",required = false) int pageNum,
                 @PathVariable(value = "pageSize",required = false) int pageSize,
                 Question question);
}
