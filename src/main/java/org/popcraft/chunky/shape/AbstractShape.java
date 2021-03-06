package org.popcraft.chunky.shape;

import org.popcraft.chunky.Selection;

public abstract class AbstractShape implements Shape {
    protected int centerX, centerZ;
    protected int diameterX, diameterZ;
    protected int radiusX, radiusZ;
    protected int x1, x2, z1, z2;

    protected AbstractShape(Selection selection) {
        this.centerX = (selection.getChunkX() << 4) + 8;
        this.centerZ = (selection.getChunkZ() << 4) + 8;
        this.diameterX = selection.getDiameterChunksX() << 4;
        this.diameterZ = selection.getDiameterChunksZ() << 4;
        this.radiusX = diameterX / 2;
        this.radiusZ = diameterZ / 2;
        this.x1 = centerX - radiusX;
        this.x2 = centerX + radiusX;
        this.z1 = centerZ - radiusZ;
        this.z2 = centerZ + radiusZ;
    }

    public double[] getCenter() {
        return new double[]{centerX, centerZ};
    }
}
