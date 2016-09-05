package fr.ironcraft.mcshow;

import com.google.gson.annotations.SerializedName;

public class EffectParameters
{
    /**
     * The X padding from the show start position.
     */
    @SerializedName("x")
    private float x;
    
    /**
     * The Y padding from the show start position.
     */
    @SerializedName("y")
    private float y;
    
    /**
     * The Z padding from the show start position.
     */
    @SerializedName("z")
    private float z;
    
    /**
     * The max age of this effect (its lifetime before it gets removed from the world) in ticks.
     */
    @SerializedName("maxAge")
    private int maxAge;

    /**
     * Gets the X padding from the show start position.
     *
     * @return The X padding from the show start position
     */
    public float getX()
    {
        return x;
    }

    /**
     * Gets the Y padding from the show start position.
     *
     * @return The Y padding from the show start position
     */
    public float getY()
    {
        return y;
    }

    /**
     * Gets the Z padding from the show start position.
     *
     * @return The Z padding from the show start position
     */
    public float getZ()
    {
        return z;
    }

    /**
     * Gets the max age of this effect (its lifetime before it gets removed from
     * the world) in ticks.
     *
     * @return The max age of this effect (its lifetime before it gets removed
     *         from the world) in ticks
     */
    public int getMaxAge()
    {
        return maxAge;
    }
    
    
}
