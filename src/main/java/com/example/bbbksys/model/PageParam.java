package com.example.bbbksys.model;

import lombok.Data;

@Data
public class PageParam {

    private Integer currentPage;

    private Integer pageSize;

    private String queryString;
}