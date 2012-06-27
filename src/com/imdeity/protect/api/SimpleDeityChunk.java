package com.imdeity.protect.api;

import org.bukkit.World;

import com.imdeity.protect.enums.DeityChunkPermissionTypes;

public class SimpleDeityChunk extends DeityChunk {

    public SimpleDeityChunk(int id, World world, int xCoord, int zCoord, String owner) {
        super(id, world, xCoord, zCoord, owner);
    }

    @Override
    public boolean runPermissionCheck(DeityChunkPermissionTypes type, String playerToVerify) {
        if (type == DeityChunkPermissionTypes.ACCESS) { return true; }
        if (this.getOwner() != null && this.getOwner().equalsIgnoreCase(playerToVerify)) { return true; }
        return false;
    }

}
