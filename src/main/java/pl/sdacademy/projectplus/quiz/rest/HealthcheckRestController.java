package pl.sdacademy.projectplus.quiz.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sdacademy.projectplus.quiz.dto.HealthCheckDto;

@RestController
@RequestMapping("/api/health")
public class HealthcheckRestController {

    @GetMapping
    public HealthCheckDto healthcheck() {
        HealthCheckDto dto = new HealthCheckDto(true, "It's working!");
        return dto;
    }
}
