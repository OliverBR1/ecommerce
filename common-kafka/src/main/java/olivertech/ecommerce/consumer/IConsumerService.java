package olivertech.ecommerce.consumer;

import olivertech.ecommerce.Message;
import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface IConsumerService<T> {

    // you may argue that a ConsumerException would be better
    // and its ok, it can be better
    void parse(ConsumerRecord<String, Message<T>> record) throws Exception;
    String getTopic();
    String getConsumerGroup();
}