package com.wr.notification;

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

    @Column(nullabe=false)
    private Type type;

    @Column(nullabe=false)
    private String message;

    @Column(nullabe=false)
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
