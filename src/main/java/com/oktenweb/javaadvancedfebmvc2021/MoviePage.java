package com.oktenweb.javaadvancedfebmvc2021;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class MoviePage {

  private List<MovieDto> movies;
  private long totalElements;
}
