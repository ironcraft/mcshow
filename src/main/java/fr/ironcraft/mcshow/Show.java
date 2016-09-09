package fr.ironcraft.mcshow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import fr.ironcraft.mcshow.effects.Effect;
import fr.ironcraft.mcshow.effects.EffectInfos;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.common.gameevent.TickEvent.RenderTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Show
{
    private List<Effect> effects;
    private ShowInfos showInfos;
    private int time;
    private boolean isPaused;
    
    public Show(ShowInfos infos)
    {
        this.showInfos = infos;
        effects = new ArrayList<Effect>();
        isPaused = false;
        time = 0;
    }

    public void reset()
    {
        effects.clear();
    }
    
    private Map<Integer, List<EffectInfos>> timeline()
    {
        return showInfos.getTimeline();
    }

    public void tick()
    {
        if (!isPaused)
        {
            for (Iterator<Effect> iterator = effects.iterator(); iterator.hasNext();)
            {
                Effect effect = iterator.next();

                if (effect.shouldBeRemoved())
                {
                    iterator.remove();
                }
                else
                {
                    effect.tick(this);
                }
            }
            
            if (timeline().containsKey(time))
            {
                for (Iterator<EffectInfos> iterator = timeline().get(time).iterator(); iterator.hasNext();)
                {
                    EffectInfos effectInfos = iterator.next();

                    addEffect(effectInfos.buildEffect());
                }
            }
            
            time++;
        }
    }

    public void addEffect(Effect effect)
    {
        if (effect != null)
        {
            effects.add(effect);
        }
    }

    public void render(Tessellator tessellator, VertexBuffer vertexbuffer)
    {
        for (Iterator<Effect> iterator = effects.iterator(); iterator.hasNext();)
        {
            Effect effect = iterator.next();

            effect.render(tessellator, vertexbuffer);
        }
    }
}
