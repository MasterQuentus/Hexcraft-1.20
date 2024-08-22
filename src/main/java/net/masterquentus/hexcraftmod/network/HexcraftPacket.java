package net.masterquentus.hexcraftmod.network;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;

import javax.annotation.Nullable;

public interface HexcraftPacket{

    /**
     * Write this packet to a {@link FriendlyByteBuf}.
     * @param buffer The {@link FriendlyByteBuf} to be written to.
     */
    void encode(FriendlyByteBuf buffer);

    /**
     * Handle receiving this packet.
     * @param sender (Server) The player who sent the packet.
     *               <p>(Client) null.</p>
     */
    void handle(@Nullable ServerPlayer sender);
}