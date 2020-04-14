package com.cem.cs443.urlredirectservice.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UrlRedirectRepository extends CrudRepository<UrlLink, Long>
{
    Optional<UrlLink> findByShortUrl(String shortUrl);
}