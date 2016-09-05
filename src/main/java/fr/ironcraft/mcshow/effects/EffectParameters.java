package fr.ironcraft.mcshow.effects;

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
     * Instantiates a new effect parameters.
     *
     * @param x The X padding from the show start position
     * @param y The Y padding from the show start position
     * @param z The Z padding from the show start position
     * @param maxAge The max age of this effect
     */
    public EffectParameters(float x, float y, float z, int maxAge)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.maxAge = maxAge;
    }

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
