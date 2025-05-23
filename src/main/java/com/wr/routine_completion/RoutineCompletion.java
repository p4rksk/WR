package com.wr.routine_completion;

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
@Table(name =  "routine_completion")
public class RoutineCompletion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "routine_id", nullable=true)
    private Routine routine; // 완료 루틴
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable=true)
    private User user; // 루틴을 완료한 사용자

    @Column(nullable=false)
    private Boolean is_done;


    @Column(nullable=false)
    private LocalDateTime completedAt;

    @Column(nullable=true)
    private LocalDateTime editedAt;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = true)
    private LocalDateTime updatedAt;

    @Builder
    public RoutineCompletion(Long id, Routine routine, User user,  Boolean is_done,
            LocalDateTime completedAt, LocalDateTime editedAt, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.routine = routine;
        this.user = user;
        this.is_done = is_done;
        this.completedAt = completedAt;
        this.editedAt = editedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    
  
   
     
    
}
