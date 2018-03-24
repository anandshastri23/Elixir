package com.Elixir.Java.Controller;


import com.Elixir.Java.Model.DeriveClassificationCodeRequest;
import com.Elixir.Java.Model.DeriveClassificationCodeResponse;
import com.Elixir.Java.rulesEngine.DroolsEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeriveClassificationCode {

    @Autowired
    DroolsEngine droolsEngine;

    @PostMapping("/classificationCode")
    public DeriveClassificationCodeResponse deriveClassificationCodeResponse(@RequestBody DeriveClassificationCodeRequest deriveClassificationCodeRequest) {
        DeriveClassificationCodeResponse deriveClassificationCodeResponse = new DeriveClassificationCodeResponse();

        droolsEngine.executeDroolsEngine(deriveClassificationCodeRequest, deriveClassificationCodeResponse);

        return deriveClassificationCodeResponse;
    }

}
