package com.wr.user;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@Table(name =  "user_tb")
@EntityListeners(AuditingEntityListener.class)  // 엔티티 리스너 추가
public class User {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String userName;

    @Column(nullable = false)
    private String passwordHash;

    @Column(nullable = true)
    private String nickName;

    @Column(nullable = true)
    private String imgName; 

    @Column(nullable = true)
    private String imgPath; 

    @Column(nullable = true)
    private String oauthId;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private OAuthProvider provider; 

    @Column(nullable = false)
    private LocalDateTime joinDate;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = true)
    private LocalDateTime updatedAt;

    public enum OAuthProvider {
        KAKAO,
        NAVER,
    }

    @Builder
    public User(Long id, String userName,  String passwordHash, String nickName, String imgName,
            String imgPath, String oauthId, OAuthProvider provider, LocalDateTime joinDate, LocalDateTime createdAt,
            LocalDateTime updatedAt) {
        this.id = id;
        this.userName = userName;
        this.passwordHash = passwordHash;
        this.nickName = nickName;
        this.imgName = imgName;
        this.imgPath = imgPath;
        this.oauthId = oauthId;
        this.provider = provider;
        this.joinDate = joinDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    
 
}