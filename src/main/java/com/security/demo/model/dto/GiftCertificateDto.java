package com.security.demo.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
@Getter
@Setter
@ToString
@AllArgsConstructor
public class GiftCertificateDto implements Serializable {

    private final Long   id;
    private final String name;
    private final String description;
    private final String price;
    private final String duration;

    @JsonIgnore
    private final LocalDateTime createdDate;
    @JsonIgnore
    private final LocalDateTime lastUpdateDate;
}
