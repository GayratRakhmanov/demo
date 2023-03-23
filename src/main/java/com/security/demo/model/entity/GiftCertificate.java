package com.security.demo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_giftCertificates")

public class GiftCertificate extends BaseEntity<Long>{

    @Column(nullable = false)
    private String name;

    private String description;
    @Column(nullable = false)
    private String price;
    @Column(nullable = false)
    private String duration;



}
