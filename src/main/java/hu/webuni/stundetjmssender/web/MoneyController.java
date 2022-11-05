package hu.webuni.stundetjmssender.web;

import hu.webuni.stundetjmssender.service.MoneyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/money")
@AllArgsConstructor
public class MoneyController {

    private final MoneyService moneyService;

    @PostMapping("/{id}")
    public void payment(@PathVariable("id") Long studentId, Long amount){
       log.info("Payment Service called for student: "+studentId);
       log.info("Amount is: "+amount);

       moneyService.payment(studentId,amount);
    }

}
