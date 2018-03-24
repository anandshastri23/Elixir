package com.Elixir.Java.rulesEngine;

import com.Elixir.Java.Model.DeriveClassificationCodeRequest;
import com.Elixir.Java.Model.DeriveClassificationCodeResponse;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.stereotype.Service;

@Service
public class DroolsEngine {

    private KieContainer kieContainer;

    public DroolsEngine() {
        kieContainer = KieServices.Factory.get().getKieClasspathContainer();
    }

    DroolsEngine(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public void executeDroolsEngine(DeriveClassificationCodeRequest deriveClassificationCodeRequest, DeriveClassificationCodeResponse deriveClassificationCodeResponse) {
        KieSession kSession = kieContainer.newKieSession("ksession-rule");
        FactHandle fact;

        fact = kSession.insert(deriveClassificationCodeRequest);
        fact = kSession.insert(deriveClassificationCodeResponse);
        kSession.fireAllRules();
    }

}
