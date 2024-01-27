package com.egin.elasticsearchdemo.repository;


import com.egin.elasticsearchdemo.model.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ItemRepository extends ElasticsearchRepository<Item, String> {



}
