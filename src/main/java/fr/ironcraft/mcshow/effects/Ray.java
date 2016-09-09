package fr.ironcraft.mcshow.effects;

import fr.ironcraft.mcshow.utils.Color;
import fr.ironcraft.mcshow.utils.RenderUtils;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;

public class Ray extends Effect<RayParameters>
{
    public Ray(RayParameters parameters)
    {
        super(parameters);
    }

    @Override
    public void render(Tessellator tessellator, VertexBuffer vertexbuffer)
    {
        GlStateManager.disableTexture2D();
        RenderUtils.color(Color.LIGHTCORAL);
        vertexbuffer.begin(7, DefaultVertexFormats.POSITION);
        vertexbuffer.pos(x, y, z).endVertex();
        vertexbuffer.pos(x + 1, y, z).endVertex();
        vertexbuffer.pos(x + 1, y + 1, z).endVertex();
        vertexbuffer.pos(x, y + 1, z).endVertex();
        tessellator.draw();
        GlStateManager.enableTexture2D();
    }
}
