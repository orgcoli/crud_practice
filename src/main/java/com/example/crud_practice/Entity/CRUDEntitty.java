package com.example.crud_practice.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "crud_tbl")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

@SequenceGenerator(
        name = "CRUD_SEQ_GENERATOR",
        sequenceName = "crud_seq",
        initialValue = 1, allocationSize = 1)
public class CRUDEntitty {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;    //게시글 번호

    @Column(name = "title", nullable = false)
    private String title;   //게시글 제목

    @Column(name = "content", nullable = false)
    private String content; //게시글 내용
}
