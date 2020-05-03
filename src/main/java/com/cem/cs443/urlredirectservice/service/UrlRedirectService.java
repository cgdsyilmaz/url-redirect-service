package com.cem.cs443.urlredirectservice.service;

import com.cem.cs443.urlredirectservice.data.UrlLink;

import java.util.Optional;

public interface UrlRedirectService
{
    Optional<UrlLink> getOrgUrlLink(String shortUrl);
    void updateURLLink(UrlLink urlLink);
}
