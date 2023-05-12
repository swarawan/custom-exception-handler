package com.swarawan.ex.controller;

import com.swarawan.ex.model.DivRequest;
import com.swarawan.ex.model.DivResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "sample")
public class SampleController {

    @PostMapping(value = "div")
    public ResponseEntity<DivResponse> div(@RequestBody DivRequest request) {
        Integer result = request.getNumber1() / request.getNumber2();

        DivResponse response = new DivResponse();
        response.setNumber1(request.getNumber1());
        response.setNumber2(request.getNumber2());
        response.setResult(result);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
