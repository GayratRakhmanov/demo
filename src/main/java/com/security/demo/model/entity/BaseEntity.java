package com.security.demo.model.entity;

import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.AbstractPersistable;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;
import java.time.LocalDateTime;
@Getter
@Setter

@MappedSuperclass
@SequenceGenerator(name = "base_seq", allocationSize = 1, initialValue = 5)
public class BaseEntity<T extends Serializable> extends AbstractPersistable<T> {

    @CreationTimestamp
    protected LocalDateTime createdDate;
    @UpdateTimestamp

    protected LocalDateTime lastUpdateDate;
}
