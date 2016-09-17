package fr.ironcraft.mcshow.effects.beambunch;

import com.google.gson.annotations.SerializedName;

import fr.ironcraft.mcshow.effects.EffectParameters;
import fr.ironcraft.mcshow.utils.Color;

public class BeamBunchParameters extends EffectParameters
{
    /**
     * Amount of beams in this bunch.
     */
    @SerializedName("amount")
    private int amount;
    
    /**
     * Angle between an horizotal plane and the bunch. In degrees.
     */
    @SerializedName("angle")
    private float angle;

    /**
     * Rotation speed : angle in degrees per tick.
     */
    @SerializedName("speed")
    private float speed;
    
    /**
     * The color of the beams.
     */
    @SerializedName("color")
    private Color color;
    
    
    /**
     * Length of a beam, in blocks.
     */
    @SerializedName("beamsLength")
    private float beamsLength;
    
    /**
     * Line width of a beam.
     */
    @SerializedName("lineWidth")
    private float lineWidth;
    
    public float getSpeed()
    {
        return speed;
    }

    public int getAmount()
    {
        return amount;
    }

    public float getAngle()
    {
        return angle;
    }

    public Color getColor()
    {
        return color;
    }
    
    public float getBeamsLength()
    {
        return beamsLength;
    }

    public float getLineWidth()
    {
        return lineWidth;
    }
}

