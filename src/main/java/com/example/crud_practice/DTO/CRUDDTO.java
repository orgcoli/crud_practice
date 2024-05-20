package com.example.crud_practice.DTO;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CRUDDTO {
    private Long id;        //게시글 id
    private String title;   //게시글 제목
    private String content; //게시글 내용
}
