package com.wr.routine;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@Table(name =  "routine")
public class Routine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String title;
    
    @Column(nullable=false)
    private String content;

    @Column(nullable=false)
    private LocalDate duedate;

    @Column(nullabe=false)
    private Boolean isPublic = false; // false == 개인
    
    @Column(nullabe=true)
    private String imgName;

    @Column(nullabe=true)
    private String imgPath;

    @Column(nullabe=true)
    private String comment;

    @Column(nullable=false)
    private LocalDateTime registeredAt;

    @Column(nullable=true)
    private LocalDateTime editedAt;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = true)
    private LocalDateTime updatedAt;

    @Builder
    public Routine(Long id, String title, String content, LocalDate duedate, Boolean isPublic, String imgName,
            String imgPath, String comment, LocalDateTime registeredAt, LocalDateTime editedAt, LocalDateTime createdAt,
            LocalDateTime updatedAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.duedate = duedate;
        this.isPublic = isPublic;
        this.imgName = imgName;
        this.imgPath = imgPath;
        this.comment = comment;
        this.registeredAt = registeredAt;
        this.editedAt = editedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    
    
}
