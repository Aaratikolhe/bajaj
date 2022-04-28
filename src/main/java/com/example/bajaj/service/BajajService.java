package com.example.bajaj.service;

import com.example.bajaj.Dao.RequestDao;
import com.example.bajaj.Dto.ResponseDto;

public interface BajajService {
    ResponseDto getResponse(RequestDao requestDao);
}
