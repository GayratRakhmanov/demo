package com.security.demo.service.impl;

import com.security.demo.mapper.GiftCertificateMapper;
import com.security.demo.model.dto.GiftCertificateDto;
import com.security.demo.model.entity.GiftCertificate;
import com.security.demo.repository.GiftCertificateRepository;
import com.security.demo.service.GiftCertificateService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;



@Slf4j
@Service
@RequiredArgsConstructor
public class GiftCertificateServiceImpl implements GiftCertificateService {

    private final GiftCertificateRepository giftCertificateRepository;
    private final GiftCertificateMapper giftCertificateMapper;

    @Override
    public GiftCertificateDto create(GiftCertificateDto giftCertificateDto) {
        GiftCertificate giftCertificate = giftCertificateMapper.toEntity(giftCertificateDto);
        giftCertificateRepository.save(giftCertificate);
        return giftCertificateMapper.toDto(giftCertificate);
    }

    @Override
    public GiftCertificateDto getOne(Long id) {
        return giftCertificateMapper.toDto(giftCertificateRepository.findById(id).orElseThrow(EntityNotFoundException::new));
    }
}
