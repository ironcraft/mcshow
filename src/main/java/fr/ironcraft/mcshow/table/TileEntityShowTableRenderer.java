package fr.ironcraft.mcshow.table;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class TileEntityShowTableRenderer extends TileEntitySpecialRenderer<TileEntityShowTable>
{
    @Override
    public void renderTileEntityAt(TileEntityShowTable te, double x, double y, double z, float partialTicks, int destroyStage)
    {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, z);

        // TODO : add tile entity appearance
        
        if (te.getCurrentShow() != null)
        {
            te.getCurrentShow().render();
        }

        GlStateManager.popMatrix();
    }
}
