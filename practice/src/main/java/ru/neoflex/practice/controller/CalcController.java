package ru.neoflex.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.practice.CalculationResultRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CalcController {
    @Autowired
    private CalculationResultRepository calculationResultRepository;

    @GetMapping("/plus/{a}/{b}")
    public Integer plusMethod(@PathVariable Integer a, @PathVariable Integer b) {
        Integer result = a + b;
        CalculationResult calculationResult = new CalculationResult();
        calculationResult.setResult(result);
        calculationResult.setOperation("plus");
        calculationResultRepository.save(calculationResult);
        return result;
    }

    @GetMapping("/minus/{a}/{b}")
    public Integer minusMethod(@PathVariable Integer a, @PathVariable Integer b) {
        Integer result = a - b;
        CalculationResult calculationResult = new CalculationResult();
        calculationResult.setResult(result);
        calculationResult.setOperation("minus");
        calculationResultRepository.save(calculationResult);
        return result;
    }
    @GetMapping("/results")
    public String getCalculationResults() {
        List<CalculationResult> calculationResults = calculationResultRepository.findAll();
        StringBuilder result = new StringBuilder();
        for (CalculationResult calculationResult : calculationResults) {
            result.append("id: ").append(calculationResult.getId()).append(", result: ").append(calculationResult.getResult()).append(", operation: ").append(calculationResult.getOperation()).append("\n");
        }
        return result.toString();
    }
}