package olivertech.ecommerce.consumer;

import java.util.Map;
import java.util.concurrent.Callable;

public class ServiceProvider<T> implements Callable<Void> {

    private final IServiceFactory<T> factory;

    public ServiceProvider(IServiceFactory<T> factory) {
        this.factory = factory;
    }

    public Void call() throws Exception {
        var myService = factory.create();
        try (var service = new KafkaService(myService.getConsumerGroup(),
                myService.getTopic(),
                myService::parse,
                Map.of())) {
            service.run();
        }
        return null;
    }

}