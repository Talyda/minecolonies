package com.minecolonies.api.colony.buildings.workerbuildings;

import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.buildings.IBuilding;
import com.minecolonies.api.tileentities.AbstractTileEntityColonyBuilding;
import com.minecolonies.api.tileentities.AbstractTileEntityWareHouse;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.Set;

public interface IWareHouse extends IBuilding
{
    /**
     * Check if deliveryman is allowed to access warehouse.
     *
     * @param buildingWorker the data of the deliveryman.
     * @return true if able to.
     */
    boolean canAccessWareHouse(ICitizenData buildingWorker);

    /**
     * Upgrade all containers by 9 slots.
     *
     * @param world the world object.
     */
    void upgradeContainers(World world);

    /**
     * Returns the tile entity that belongs to the colony building.
     *
     * @return {@link AbstractTileEntityColonyBuilding} object of the building.
     */
    @Override
    AbstractTileEntityWareHouse getTileEntity();

    /**
     * Check if a container position belongs to the warehouse.
     *
     * @param inDimensionLocation the location.
     * @return true if so.
     */
    boolean hasContainerPosition(BlockPos inDimensionLocation);
}
