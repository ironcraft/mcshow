package fr.ironcraft.mcshow.table;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.ironcraft.mcshow.Show;
import fr.ironcraft.mcshow.ShowInfos;
import fr.ironcraft.mcshow.effects.EffectInfos;
import fr.ironcraft.mcshow.effects.RayParameters;
import fr.ironcraft.mcshow.effects.TesterParameters;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityShowTable extends TileEntity implements ITickable
{
    private Show currentShow;
    
    public void playerClick()
    {
        Map<Integer, List<EffectInfos>> map = new HashMap<Integer, List<EffectInfos>>();
        
        map.put(0, Arrays.asList(new EffectInfos("Tester", new TesterParameters(1, 1, 1, 400)), new EffectInfos("Ray", new RayParameters(0.0f, 1.0f, 0.0f, 400, 12345467))));
        
        ShowInfos showInfos = new ShowInfos("show de test", map);
        currentShow = new Show(showInfos);
    }
    
    public Show getCurrentShow()
    {
        return currentShow;
    }
    
    @Override
    public void update()
    {
        if (currentShow != null)
        {
            currentShow.tick();
        }
    }
}
