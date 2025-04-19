package com.wr.notification;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.wr.routine.Routine;
import com.wr.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
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
@Table(name =  "notification")
@EntityListeners(AuditingEntityListener.class)
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reciver_id", nullable=false)
    private User reciver;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender_id", nullable=false)
    private User sender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "routine_id", nullable=false)
    private Routine routine;

    @Column(nullable = false)
    private Type type;

    @Column(nullable=false)
    private String message;

    @Column(nullable=false)
    private Boolean is_read = false;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = true)
    private LocalDateTime updatedAt;

    private enum Type {
        ROUTINE_COMPLETED,
        COMMENT_RECEIVED
    }

    @Builder
    public Notification(Long id, User reciver, User sender, Routine routine, Type type, String message, Boolean is_read,
            LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.reciver = reciver;
        this.sender = sender;
        this.routine = routine;
        this.type = type;
        this.message = message;
        this.is_read = is_read;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    

}
