package olivertech.ecommerce.consumer;

public interface IServiceFactory<T> {
    IConsumerService<T> create() throws Exception;
}
