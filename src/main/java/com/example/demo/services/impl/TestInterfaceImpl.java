package com.example.demo.services.impl;

import com.example.demo.services.TestInterface;

import java.util.List;

public class TestInterfaceImpl implements TestInterface {
    @Override
    public List<String> getTests() {
        return List.of();
    }
}
