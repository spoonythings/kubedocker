package com.spoonythings.kubedocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kubeController {

    @GetMapping("/message")
    public String getMessage(){

        return "Hello welcome to minikube/docker/jenkins";
    }
}

