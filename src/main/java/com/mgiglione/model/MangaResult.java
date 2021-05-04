package com.mgiglione.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class MangaResult {

    @JsonProperty("results")
    private List<Manga> result;
    
}
