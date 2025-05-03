package com.wr.routine;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Controller
public class RoutineController {
    private final RoutineService routineService;


    @GetMapping("/")
    public String myRoutines() {
        return "routine/index";
    }

    @GetMapping("/routines/{id}/detail")
    public String routineDetail() {
        return "routine/detail";
    }
    
    // 팀 루틴 화면
    @GetMapping("/routines/team/{teamId}")
    public String teamRoutines() {
        return "routine/team/routine";
    }

}