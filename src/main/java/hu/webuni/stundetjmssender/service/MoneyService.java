package hu.webuni.stundetjmssender.service;

import hu.webuni.definition.PaymentMesssage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class MoneyService {

    private final JmsTemplate jmsTemplate;

    public void payment(Long studentId, Long amount){
    jmsTemplate.convertAndSend("payment",new PaymentMesssage(studentId,amount));
    log.info("Payment has been succesfully sent....");
    }

}
