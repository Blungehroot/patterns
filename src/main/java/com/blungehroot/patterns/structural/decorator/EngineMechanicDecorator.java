package com.blungehroot.patterns.structural.decorator;

public class EngineMechanicDecorator implements EngineMechanic {
    EngineMechanic engineMechanic;

    public EngineMechanicDecorator(EngineMechanic engineMechanic) {
        this.engineMechanic = engineMechanic;
    }

    @Override
    public String engineDiagnostic() {
        return engineMechanic.engineDiagnostic();
    }
}
