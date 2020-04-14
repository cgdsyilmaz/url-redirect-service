package com.cem.cs443.urlredirectservice.service;

import com.cem.cs443.urlredirectservice.data.UrlLink;
import com.cem.cs443.urlredirectservice.data.UrlRedirectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class UrlRedirectServiceImpl implements UrlRedirectService
{
    @Autowired
    private UrlRedirectRepository urlRedirectRepository;

    @Override
    public Optional<UrlLink> getOrgUrlLink(String shortUrl) {
        return urlRedirectRepository.findByShortUrl(shortUrl);
    }
}
