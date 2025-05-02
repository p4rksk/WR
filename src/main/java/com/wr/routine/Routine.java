package com.wr.routine;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.wr.team.Team;
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
@Table(name =  "routine")
public class Routine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", nullable=true)
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable=true)
    private User user;

    
    @Column(nullable=false)
    private String title;
    
    @Column(nullable=false)
    private String content;

    @Column(nullable=false)
    private LocalDate duedate;

    @Column(nullable=false)
    private AccessLevel accessLevel;
    
    @Column(nullable=true)
    private String imgName;

    @Column(nullable=true)
    private String imgPath;

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

     public enum AccessLevel {
        INDIVIDUAL, 
        TEAM_PRIVATE, 
        TEAM_SHARED
    }

    @Builder
     public Routine(Long id, Team team, String title, String content, LocalDate duedate, AccessLevel accessLevel,
            String imgName, String imgPath, LocalDateTime registeredAt, LocalDateTime editedAt,
            LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.team = team;
        this.title = title;
        this.content = content;
        this.duedate = duedate;
        this.accessLevel = accessLevel;
        this.imgName = imgName;
        this.imgPath = imgPath;
        this.registeredAt = registeredAt;
        this.editedAt = editedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
     }

     
    
}
