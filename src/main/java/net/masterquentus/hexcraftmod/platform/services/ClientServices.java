package net.masterquentus.hexcraftmod.platform.services;

import net.masterquentus.hexcraftmod.platform.services.IClientRegistryHelper;

public class ClientServices {

    public static final IClientRegistryHelper CLIENT_REGISTRY = CommonServices.load(IClientRegistryHelper.class);

}