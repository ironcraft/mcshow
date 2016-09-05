package fr.ironcraft.mcshow;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import fr.ironcraft.mcshow.effects.EffectInfos;

public class ShowInfos
{
    /**
     * This show's name.
     */
    @SerializedName("name")
    private final String name;
    
    /**
     * This show's timeline. A mapping time -> effects happening.
     */
    @SerializedName("timeline")
    private final Map<Integer, List<EffectInfos>> timeline;

    public ShowInfos(String name, Map<Integer, List<EffectInfos>> timeline)
    {
        this.name = name;
        this.timeline = timeline;
    }
    
    public Map<Integer, List<EffectInfos>> getTimeline()
    {
        return timeline;
    }

    @Override
    public String toString()
    {
        return "ShowInfos [name=" + name + ", timeline=" + timeline + "]";
    }
}
