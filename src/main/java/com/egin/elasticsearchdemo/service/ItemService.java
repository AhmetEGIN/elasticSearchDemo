package com.egin.elasticsearchdemo.service;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import com.egin.elasticsearchdemo.model.Item;
import com.egin.elasticsearchdemo.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;
    private final JsonDataService jsonDataService;
    private final ElasticsearchClient elasticsearchClient;


    public Item createIndex(Item item) {

        return itemRepository.save(item);

    }
}
