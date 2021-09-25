package com.blungehroot.patterns.structural.decorator;

public class Work {
    public static void main(String[] args) {
        EngineMechanic engineMechanic = new LeadEngineAutoMechanic( new MasterEngineEngineMechanic(new EngineAutoMechanic()));

        System.out.println(engineMechanic.engineDiagnostic());
    }
}
