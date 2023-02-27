import api.IGreeting;
import frenchApi.Greeting;
import spi.ISayBonjourService;

module French {
    requires Core;
    exports frenchApi;
    provides IGreeting with Greeting;
    uses ISayBonjourService;
}