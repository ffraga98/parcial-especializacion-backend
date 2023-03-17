package com.dh.catalogservice.api.client;

import com.dh.catalogservice.domain.model.Movie;
//import com.dh.catalogservice.configuration.CustomLoadBalancerConfiguration;
//import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "movie-service")
//@LoadBalancerClient(name = "movie-service", configuration = CustomLoadBalancerConfiguration.class)
public interface iMovieServiceClient {
    @GetMapping("movies/{genre}")
    List<Movie> getMovieByGenre(@PathVariable String genre);

    //@GetMapping("movies/instance")
    //String getInstance();

}