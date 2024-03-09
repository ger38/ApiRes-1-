package com.Gerardo.ApiRes.dtos;

import lombok.Data;

import java.util.List;

@Data
public class ReservaRequest {
    private HuespedRequest huesped;
    private List<HuespedRequest> huespedRequests;
}
