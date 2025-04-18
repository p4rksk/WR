package com.wr.routine_category;

import java.util.Locale.Category;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.wr.routine.Routine;

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
@Table(name =  "routine_category")
@EntityListeners(AuditingEntityListener.class)
public class RoutineCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "routine_id", nullable=false)
    private Routine routine;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable=false)
    private Category category;

    @Builder
    public RoutineCategory(Long id, Routine routine, Category category) {
        this.id = id;
        this.routine = routine;
        this.category = category;
    }

    

}
