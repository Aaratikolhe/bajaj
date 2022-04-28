package com.example.bajaj.controller;

import com.example.bajaj.Dao.RequestDao;
import com.example.bajaj.Dto.ResponseDto;
import com.example.bajaj.service.BajajService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BajajController {

    @Autowired
    private BajajService bajajService;

    @PostMapping("/bfhl")
    public ResponseDto placeOrder(@RequestBody RequestDao data)
    {
        return bajajService.getResponse(data);
    }
}
