import api.IGreeting;
import main.adapters.BonjourService;
import main.adapters.HelloService;
import spi.ISayBonjourService;
import spi.ISayHelloService;

module Infra {
    requires Core;
    requires French;
    requires English;
    provides ISayHelloService with HelloService;
    provides ISayBonjourService with BonjourService;
    uses IGreeting;
}