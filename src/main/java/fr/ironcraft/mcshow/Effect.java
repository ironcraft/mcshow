package fr.ironcraft.mcshow;

/**
 * Represents an actual effect in the world.
 *
 * @param <P> The parameters type.
 */
public abstract class Effect<P extends EffectParameters>
{
    /**
     * Set to {@code true} whenever this effect should be removed from the
     * world. It will be destroyed by the effects manager on the next tick.
     */
    protected boolean shouldBeRemoved = false;

    /**
     * The parameters of this effect.
     */
    protected final P parameters;

    public Effect(P parameters)
    {
        this.parameters = parameters;
    }

    /**
     * Gets the parameters of this effect.
     *
     * @return The parameters of this effect
     */
    public P getParameters()
    {
        return parameters;
    }

    /**
     * Updates this effect.
     */
    public void tick()
    {
        
    }

    /**
     * @return {@code true} whenever this effect should be removed from the
     *         world.
     */
    public boolean shouldBeRemoved()
    {
        return shouldBeRemoved;
    }

    /**
     * Set to {@code true} whenever this effect should be removed from the
     * world.
     * 
     * @param shouldBeRemoved {@code true} if this effect should be removed or
     *        not, {@code false} otherwise
     */
    public void setShouldBeRemoved(boolean shouldBeRemoved)
    {
        this.shouldBeRemoved = shouldBeRemoved;
    }

    /**
     * Render.
     */
    public abstract void render();
}
