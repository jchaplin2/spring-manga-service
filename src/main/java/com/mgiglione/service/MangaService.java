package com.mgiglione.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mgiglione.model.Manga;
import com.mgiglione.model.MangaResult;

@Service
public class MangaService {

    Logger logger = LoggerFactory.getLogger(MangaService.class);
    public static final String MANGA_SEARCH_URL="https://api.jikan.moe/v3/search/manga?q=";

    @Autowired
    RestTemplate restTemplate;

    public List<Manga> getMangasByTitle(String title) {
        return restTemplate.getForEntity(MANGA_SEARCH_URL+title, MangaResult.class).getBody().getResult();
    }

}
