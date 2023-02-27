package main.adapters;

import spi.ISayBonjourService;

public class BonjourService implements ISayBonjourService {
    @Override
    public String sayBonjour() {
        return "Bonjour";
    }
}
