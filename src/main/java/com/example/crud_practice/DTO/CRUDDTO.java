package com.example.crud_practice.DTO;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CRUDDTO {
    private Long id;
    private String title;
    private String content;
}
