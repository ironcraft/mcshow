package fr.ironcraft.mcshow.effects.tester;

import fr.ironcraft.mcshow.effects.Effect;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;

public class Tester extends Effect<TesterParameters>
{
    public Tester(TesterParameters parameters)
    {
        super(parameters);
    }

    @Override
    public void render(Tessellator tessellator, VertexBuffer vertexbuffer, float partialTicks)
    {
        
    }
}
