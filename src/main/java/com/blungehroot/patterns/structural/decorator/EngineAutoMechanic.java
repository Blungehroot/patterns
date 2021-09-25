package com.blungehroot.patterns.structural.decorator;

public class EngineAutoMechanic implements EngineMechanic {
    @Override
    public String engineDiagnostic() {
        return "Diagnostic engine";
    }
}
