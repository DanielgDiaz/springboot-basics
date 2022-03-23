package com.danigdiaz.fundamentsspringboot.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Hola desde mi componente 2");
    }
}
