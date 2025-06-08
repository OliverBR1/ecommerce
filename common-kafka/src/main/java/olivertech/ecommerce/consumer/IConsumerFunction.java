package olivertech.ecommerce.consumer;

import olivertech.ecommerce.Message;
import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface IConsumerFunction<T> {
    void consume(ConsumerRecord<String, Message<T>> record) throws Exception;
}
