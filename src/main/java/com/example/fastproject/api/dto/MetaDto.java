package com.example.fastproject.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MetaDto {

    @JsonProperty("total_count") //json으로 응답을 받을 때 스네이크표기법을 카멜표기법으로 매핑
    private Integer totalCount;
}
