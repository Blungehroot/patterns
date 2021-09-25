package com.blungehroot.patterns.structural.decorator;

public class LeadEngineAutoMechanic extends EngineMechanicDecorator {
    public LeadEngineAutoMechanic(EngineMechanic engineMechanic) {
        super(engineMechanic);
    }

    public String approveRepairWork() {
        return " Approve repair work";
    }

    @Override
    public String engineDiagnostic() {
        return super.engineDiagnostic() + approveRepairWork();
    }
}
