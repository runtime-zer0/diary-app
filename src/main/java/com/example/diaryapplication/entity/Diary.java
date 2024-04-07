package com.example.diaryapplication.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Diary extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String mood;

    @Column(nullable = false)
    private String weather;

    @Column(nullable = false)
    private String content;

    @Builder
    public Diary(String title, String mood, String weather, String content) {
        this.title = title;
        this.mood = mood;
        this.weather = weather;
        this.content = content;
    }
}
