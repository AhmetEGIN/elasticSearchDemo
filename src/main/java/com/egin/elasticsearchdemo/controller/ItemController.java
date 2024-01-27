package com.egin.elasticsearchdemo.controller;

import com.egin.elasticsearchdemo.model.Item;
import com.egin.elasticsearchdemo.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping
    public Item createIndex(@RequestBody Item item) {
        return itemService.createIndex(item);
    }



}
