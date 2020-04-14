package com.cem.cs443.urlredirectservice.controller;

import com.cem.cs443.urlredirectservice.data.UrlLink;
import com.cem.cs443.urlredirectservice.service.UrlRedirectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@RequestMapping("/r")
public class UrlRedirectController
{
    private final String URL_NOT_FOUND_VIEW = "short_url_not_found";
    @Autowired
    private UrlRedirectService urlRedirectService;

    @GetMapping("/{short_link}")
    public ModelAndView redirect(@PathVariable("short_link") String short_link)
    {
        Optional<UrlLink> urlLink = urlRedirectService.getOrgUrlLink(short_link);
        return urlLink
                .map(link -> new ModelAndView("redirect:" + link.getOriginalUrl()))
                .orElseGet(() -> new ModelAndView(URL_NOT_FOUND_VIEW));
    }

}
