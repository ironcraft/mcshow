package fr.ironcraft.mcshow.effects;

public class Ray extends Effect<RayParameters>
{
    public Ray(RayParameters parameters)
    {
        super(parameters);
    }

    @Override
    public void render()
    {
        System.out.println("render rayyyy");
    }
}
