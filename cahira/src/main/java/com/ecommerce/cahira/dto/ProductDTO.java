package com.ecommerce.cahira.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private Long id;
    private String name;
    private Integer categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
