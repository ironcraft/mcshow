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
    public void render()
    {
        Tessellator tessellator = Tessellator.getInstance();
        VertexBuffer vertexbuffer = tessellator.getBuffer();
        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        RenderUtils.color(Color.ALICEBLUE);
        vertexbuffer.begin(7, DefaultVertexFormats.POSITION_COLOR);
        vertexbuffer.pos(x, y, z).color(1.0f, 0.0f, 1.0f, 1.0f).endVertex();
        vertexbuffer.pos(x + 1, y, z).color(1.0f, 0.0f, 1.0f, 1.0f).endVertex();
        vertexbuffer.pos(x + 1, y + 1, z).color(1.0f, 0.0f, 1.0f, 1.0f).endVertex();
        vertexbuffer.pos(x, y + 1, z).color(1.0f, 0.0f, 1.0f, 1.0f).endVertex();
        tessellator.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.disableBlend();
    }
}
