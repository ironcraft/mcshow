package fr.ironcraft.mcshow.effects.torus;

import com.google.gson.annotations.SerializedName;

import fr.ironcraft.mcshow.effects.EffectParameters;
import fr.ironcraft.mcshow.utils.Color;

public class TorusParameters extends EffectParameters
{
    /**
     * The radius "R" of the torus. Represents the biggest circle.
     */
    @SerializedName("bigCircleRadius")
    private float bigCircleRadius;
    
    /**
     * The radius "r" of the torus. Represents the smallest circle.
     */
    @SerializedName("smallCircleRadius")
    private float smallCircleRadius;
    
    private int amountOfRings;
    private int amountOfSides;
    
    /**
     * The color of the torus.
     */
    @SerializedName("color")
    private Color color;

    public float getBigCircleRadius()
    {
        return bigCircleRadius;
    }

    public float getSmallCircleRadius()
    {
        return smallCircleRadius;
    }

    public Color getColor()
    {
        return color;
    }

    public int getAmountOfRings()
    {
        return amountOfRings;
    }

    public int getAmountOfSides()
    {
        return amountOfSides;
    }
    
    
}
