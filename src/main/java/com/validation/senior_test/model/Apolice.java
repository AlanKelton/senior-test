package com.validation.senior_test.model;

import java.time.LocalDateTime;
import java.util.List;

public class Apolice {

    private Long id;

    private String numero;
    private String segurado;
    private Double valorSegurado;
    private LocalDateTime inicioVigencia;

    private LocalDateTime fimVigencia;

    private List<Sinistro> sinistros;


}