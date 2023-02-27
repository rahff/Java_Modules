import EnglishApi.Greeting;
import api.IGreeting;
import spi.ISayHelloService;

module English {
    requires Core;
    exports EnglishApi;
    provides IGreeting with Greeting;
    uses ISayHelloService;
}