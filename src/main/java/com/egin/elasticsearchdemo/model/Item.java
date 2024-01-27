package com.egin.elasticsearchdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;


@Getter
@Setter
@Document(indexName = "item_index")
@JsonIgnoreProperties(ignoreUnknown = true)
@Setting(settingPath = "static/es-settings.json")
public class Item {

    @Id
    private String id;

    @Field(name = "name", type = FieldType.Text)
    private String name;

    @Field(name = "name", type = FieldType.Double)
    private Double price;

    @Field(name = "name", type = FieldType.Text)
    private String brand;

    @Field(name = "name", type = FieldType.Keyword)
    private String category;


}
