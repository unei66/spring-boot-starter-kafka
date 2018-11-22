package io.github.goudai.kafka.transaction.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DbEventMapper implements EventMapper{

    @Autowired
    KafkaTransactionProducerAutoConfiguration.KafkaTransactionProducerProperties producerProperties;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void insertEvent(Event event) {

    }

    @Override
    public List<Event> getUnsentEvents() {
        return null;
    }

    @Override
    public void onSendSuccessful(Event event) {

    }
}
