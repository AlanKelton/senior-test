package com.validation.senior_test.model;

import java.time.LocalDate;
import java.util.List;

public class Apolice {

    private Long id;

    private String numero;
    private String segurado;
    private Double valorSegurado;

    private LocalDate dataVigencia;

    private List<Sinistro> sinistros;


}