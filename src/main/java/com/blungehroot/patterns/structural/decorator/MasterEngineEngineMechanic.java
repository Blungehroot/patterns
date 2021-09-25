package com.blungehroot.patterns.structural.decorator;

public class MasterEngineEngineMechanic extends EngineMechanicDecorator {
    public MasterEngineEngineMechanic(EngineMechanic engineMechanic) {
        super(engineMechanic);
    }

    public String repairEngine() {
        return " Engine repair";
    }

    @Override
    public String engineDiagnostic() {
        return super.engineDiagnostic() + repairEngine();
    }
}
