package fr.ironcraft.mcshow.table;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.math.BlockPos;


public class TileEntityShowTableRenderer extends TileEntitySpecialRenderer<TileEntityShowTable>
{
    @Override
    public void renderTileEntityAt(TileEntityShowTable te, double x, double y, double z, float partialTicks, int destroyStage)
    {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, z);
        int i = te.getBrightnessForRender(partialTicks);
        int j = i % 65536;
        int k = i / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);

        // TODO : add tile entity appearance

        if (te.getCurrentShow() != null)
        {
            te.getCurrentShow().render();
        }

        GlStateManager.popMatrix();
    }
}
