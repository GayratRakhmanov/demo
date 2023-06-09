package com.security.demo.controller;

import com.security.demo.model.dto.GiftCertificateDto;
import com.security.demo.service.GiftCertificateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/avi/v1/giftCertificates")
public class GiftCertificateController {

    private final GiftCertificateService giftCertificateService;

    @PostMapping
    public GiftCertificateDto create(GiftCertificateDto giftCertificateDto) {
        return  giftCertificateService.create(giftCertificateDto);
    }
    @GetMapping("/{id}")
    public GiftCertificateDto getOne(@PathVariable Long id) {
        return  giftCertificateService.getOne(id);
    }
}
