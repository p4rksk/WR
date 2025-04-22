package com.wr.user_routine;

import java.time.LocalDateTime;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.wr.routine.Routine;
import com.wr.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@Table(name =  "user_routine")
@EntityListeners(AuditingEntityListener.class)  // 엔티티 리스너 추가
public class UserRoutine {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable=false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "routine_id", nullable=false)
    private Routine routine;

    @Column(nullable=false)
    private LocalDateTime completedAt; // 루틴 생성시간

    @Column(nullable=true)
    private LocalDateTime assignedAt; // 루틴 할당 시간

    public UserRoutine(Long id, User user, Routine routine, LocalDateTime completedAt, LocalDateTime assignedAt) {
        this.id = id;
        this.user = user;
        this.routine = routine;
        this.completedAt = completedAt;
        this.assignedAt = assignedAt;
    }

    
}
