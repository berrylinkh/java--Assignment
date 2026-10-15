package com.lastma.data.models;

public enum ViolationTypes {
    OVERSPEEDING(50_000),
    DUI(11_000),
    EXPIRED_PAPERS(100_000),
    TRAFFIC_LIGHT_OFFENCE(20_000),
    ONE_WAY_PASS(50_000),
    ;

    ViolationTypes(double fee){

    }


}
