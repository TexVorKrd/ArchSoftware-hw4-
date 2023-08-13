package Core;

import Interfaces.ICarrierRepo;
import Interfaces.ICashRepo;
import Models.Carrier;
import Models.Ticket;
import Models.User;
import Services.CarrierRepository;
import Services.CashRepository;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider {

    private long cardNumber;
    private boolean isAuthorizeed;
    private ICashRepo cashRepository;
    private ICarrierRepo carrierRepository;

    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }

    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */

    public boolean buy(Ticket ticket){

    //Из кода непонятна логика оплаты
    //В исключениях прописн выброс исключения.
    //Будем выбрасывать пр непройденой авторизации

    if (!isAuthorizeed) throw new RuntimeException("Авторизация не пройдена");

    Carrier carrier = carrierRepository.read(1);
    return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());


    }

    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
     *
     * @param client
     */
    public void authorization (User client){

        //Логика авторизации не реализована. устанавливаем на true
        isAuthorizeed=true;

    }


}
