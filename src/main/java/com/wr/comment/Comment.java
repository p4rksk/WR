package com.wr.comment;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.wr.routine.Routine;
import com.wr.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@Table(name =  "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "routine_id", nullable=true)
    private Routine routine; // 코멘트가 등록된 루틴
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable=true)
    private User user; // 코멘트를 등록한 사용자

    @Column(columnDefinition = "TEXT", nullable = false)    
    private String content;

    @Column(nullable = false)
    private LocalDateTime writtenAt;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = true)
    private LocalDateTime updatedAt;

    @Builder
    public Comment(Long id, Routine routine, User user, String content, LocalDateTime writtenAt,
            LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.routine = routine;
        this.user = user;
        this.content = content;
        this.writtenAt = writtenAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
