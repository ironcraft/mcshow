package fr.ironcraft.mcshow.table;

import fr.ironcraft.mcshow.Show;
import fr.ironcraft.mcshow.ShowInfos;
import fr.ironcraft.mcshow.ShowsManager;
import fr.ironcraft.mcshow.mod.McShowMod;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityShowTable extends TileEntity
{
    private Show currentShow;
    
    public void playerClick()
    {
        ShowInfos showInfos = ShowInfos.read(ShowInfos.class.getResourceAsStream("show_test.json"));
        currentShow = new Show(showInfos, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5);
        
        McShowMod.showsManager.startShow(currentShow);
    }
    
    public Show getCurrentShow()
    {
        return currentShow;
    }
}
