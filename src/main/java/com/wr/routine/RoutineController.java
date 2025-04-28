package com.wr.routine;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Controller
public class RoutineController {
    private final RoutineService routineService;


    @GetMapping("/")
    public String main() {
        return "routine/index";
    }

    @GetMapping("/routine/{id}/detail")
    public String routineDetail() {
        return "routine/detail";
    }
    
    
}