package fr.ironcraft.mcshow.effects;

import com.google.gson.annotations.SerializedName;


public class RayParameters extends EffectParameters
{
    @SerializedName("color")
    private int color;
    
    public RayParameters(float x, float y, float z, int maxAge, int color)
    {
        super(x, y, z, maxAge);
        this.color = color;
    }
}
