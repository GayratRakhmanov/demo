package com.security.demo.mapper;

import com.security.demo.model.dto.GiftCertificateDto;
import com.security.demo.model.entity.GiftCertificate;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.WARN)
public interface GiftCertificateMapper {


   GiftCertificate toEntity(GiftCertificateDto dto);
   GiftCertificateDto toDto(GiftCertificate entity);

}
