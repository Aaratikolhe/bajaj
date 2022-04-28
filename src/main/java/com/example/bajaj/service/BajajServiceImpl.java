package com.example.bajaj.service;

import com.example.bajaj.Dao.RequestDao;
import com.example.bajaj.Dto.ResponseDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BajajServiceImpl implements BajajService {

    @Override
    public ResponseDto getResponse(RequestDao requestDao) {
        ResponseDto responseDto = new ResponseDto();
        responseDto.setIs_success(true);
        responseDto.setRoll_number("PD0461");
        responseDto.setUser_id("aarati_kolhe_06071996");
        responseDto.setEmail("kolhe.aarati@gmail.com");
        List<String> numbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        for (String s : requestDao.getData()) {
            if (Character.isDigit(s.charAt(0))) {
                numbers.add(s);
            } else {
                alphabets.add(s);
            }
        }
        responseDto.setNumbers(numbers);
        responseDto.setAlphabets(alphabets);
        return responseDto;
    }

}
